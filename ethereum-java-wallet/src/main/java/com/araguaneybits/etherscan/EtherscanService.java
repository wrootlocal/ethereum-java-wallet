/*
 * Copyright 2017 AraguaneyBits
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.araguaneybits.etherscan;

import java.io.IOException;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.codehaus.jackson.map.ObjectMapper;


/**
 *
 * @author Jose Luis Estevez Prieto
 * jose.estevez.prieto@gmail.com
 * http://www.joseluisestevez.com.ve/
 * 
 */
public class EtherscanService {

    private final static String ETHERSCAN_APIKEY = "<COLOCA AQUI TU APIKEY>";
    private final static String ENDPOINT_TRANSACTIONS_LIST = "/api?module=account&action=txlist";
    private final static String API_RESTFUL_URI = "http://rinkeby.etherscan.io";

    public static Transactions getTransactionsByAddress(String address) {
        String endpoint = API_RESTFUL_URI + ENDPOINT_TRANSACTIONS_LIST;
        
        Client client = ClientBuilder.newClient();
        Response response = client.target(endpoint)
                .queryParam("address", address)
                .queryParam("startblock", "0")
                .queryParam("endblock", "99999999")
                .queryParam("sort", "asc")
                .queryParam("apikey", ETHERSCAN_APIKEY)
                .request(MediaType.APPLICATION_JSON)
                .get();
        
        String json = response.readEntity(String.class);
        
        client.close();
        ObjectMapper mapper = new ObjectMapper();
        Transactions transactions = null;
        if (response.getStatus() == 200) {
            try {
                transactions = mapper.readValue(json, Transactions.class);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return transactions;
    }

}
