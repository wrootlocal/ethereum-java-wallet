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

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.codehaus.jackson.annotate.JsonAnyGetter;
import org.codehaus.jackson.annotate.JsonAnySetter;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;
/**
 *
 * @author Jose Luis Estevez Prieto
 * jose.estevez.prieto@gmail.com
 * http://www.joseluisestevez.com.ve/
 * 
 */
public class Result implements Serializable
{

    @JsonProperty("blockNumber")
    private String blockNumber;
    @JsonProperty("timeStamp")
    private String timeStamp;
    @JsonProperty("hash")
    private String hash;
    @JsonProperty("nonce")
    private String nonce;
    @JsonProperty("blockHash")
    private String blockHash;
    @JsonProperty("transactionIndex")
    private String transactionIndex;
    @JsonProperty("from")
    private String from;
    @JsonProperty("to")
    private String to;
    @JsonProperty("value")
    private String value;
    @JsonProperty("gas")
    private String gas;
    @JsonProperty("gasPrice")
    private String gasPrice;
    @JsonProperty("isError")
    private String isError;
    @JsonProperty("input")
    private String input;
    @JsonProperty("contractAddress")
    private String contractAddress;
    @JsonProperty("cumulativeGasUsed")
    private String cumulativeGasUsed;
    @JsonProperty("gasUsed")
    private String gasUsed;
    @JsonProperty("confirmations")
    private String confirmations;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 5590448468984340594L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Result() {
    }

    /**
     * 
     * @param to
     * @param confirmations
     * @param timeStamp
     * @param hash
     * @param cumulativeGasUsed
     * @param transactionIndex
     * @param from
     * @param gas
     * @param input
     * @param nonce
     * @param value
     * @param gasPrice
     * @param gasUsed
     * @param isError
     * @param contractAddress
     * @param blockNumber
     * @param blockHash
     */
    public Result(String blockNumber, String timeStamp, String hash, String nonce, String blockHash, String transactionIndex, String from, String to, String value, String gas, String gasPrice, String isError, String input, String contractAddress, String cumulativeGasUsed, String gasUsed, String confirmations) {
        super();
        this.blockNumber = blockNumber;
        this.timeStamp = timeStamp;
        this.hash = hash;
        this.nonce = nonce;
        this.blockHash = blockHash;
        this.transactionIndex = transactionIndex;
        this.from = from;
        this.to = to;
        this.value = value;
        this.gas = gas;
        this.gasPrice = gasPrice;
        this.isError = isError;
        this.input = input;
        this.contractAddress = contractAddress;
        this.cumulativeGasUsed = cumulativeGasUsed;
        this.gasUsed = gasUsed;
        this.confirmations = confirmations;
    }

    @JsonProperty("blockNumber")
    public String getBlockNumber() {
        return blockNumber;
    }

    @JsonProperty("blockNumber")
    public void setBlockNumber(String blockNumber) {
        this.blockNumber = blockNumber;
    }

    @JsonProperty("timeStamp")
    public String getTimeStamp() {
        return timeStamp;
    }

    @JsonProperty("timeStamp")
    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    @JsonProperty("hash")
    public String getHash() {
        return hash;
    }

    @JsonProperty("hash")
    public void setHash(String hash) {
        this.hash = hash;
    }

    @JsonProperty("nonce")
    public String getNonce() {
        return nonce;
    }

    @JsonProperty("nonce")
    public void setNonce(String nonce) {
        this.nonce = nonce;
    }

    @JsonProperty("blockHash")
    public String getBlockHash() {
        return blockHash;
    }

    @JsonProperty("blockHash")
    public void setBlockHash(String blockHash) {
        this.blockHash = blockHash;
    }

    @JsonProperty("transactionIndex")
    public String getTransactionIndex() {
        return transactionIndex;
    }

    @JsonProperty("transactionIndex")
    public void setTransactionIndex(String transactionIndex) {
        this.transactionIndex = transactionIndex;
    }

    @JsonProperty("from")
    public String getFrom() {
        return from;
    }

    @JsonProperty("from")
    public void setFrom(String from) {
        this.from = from;
    }

    @JsonProperty("to")
    public String getTo() {
        return to;
    }

    @JsonProperty("to")
    public void setTo(String to) {
        this.to = to;
    }

    @JsonProperty("value")
    public String getValue() {
        return value;
    }

    @JsonProperty("value")
    public void setValue(String value) {
        this.value = value;
    }

    @JsonProperty("gas")
    public String getGas() {
        return gas;
    }

    @JsonProperty("gas")
    public void setGas(String gas) {
        this.gas = gas;
    }

    @JsonProperty("gasPrice")
    public String getGasPrice() {
        return gasPrice;
    }

    @JsonProperty("gasPrice")
    public void setGasPrice(String gasPrice) {
        this.gasPrice = gasPrice;
    }

    @JsonProperty("isError")
    public String getIsError() {
        return isError;
    }

    @JsonProperty("isError")
    public void setIsError(String isError) {
        this.isError = isError;
    }

    @JsonProperty("input")
    public String getInput() {
        return input;
    }

    @JsonProperty("input")
    public void setInput(String input) {
        this.input = input;
    }

    @JsonProperty("contractAddress")
    public String getContractAddress() {
        return contractAddress;
    }

    @JsonProperty("contractAddress")
    public void setContractAddress(String contractAddress) {
        this.contractAddress = contractAddress;
    }

    @JsonProperty("cumulativeGasUsed")
    public String getCumulativeGasUsed() {
        return cumulativeGasUsed;
    }

    @JsonProperty("cumulativeGasUsed")
    public void setCumulativeGasUsed(String cumulativeGasUsed) {
        this.cumulativeGasUsed = cumulativeGasUsed;
    }

    @JsonProperty("gasUsed")
    public String getGasUsed() {
        return gasUsed;
    }

    @JsonProperty("gasUsed")
    public void setGasUsed(String gasUsed) {
        this.gasUsed = gasUsed;
    }

    @JsonProperty("confirmations")
    public String getConfirmations() {
        return confirmations;
    }

    @JsonProperty("confirmations")
    public void setConfirmations(String confirmations) {
        this.confirmations = confirmations;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(blockNumber).append(timeStamp).append(hash).append(nonce).append(blockHash).append(transactionIndex).append(from).append(to).append(value).append(gas).append(gasPrice).append(isError).append(input).append(contractAddress).append(cumulativeGasUsed).append(gasUsed).append(confirmations).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Result) == false) {
            return false;
        }
        Result rhs = ((Result) other);
        return new EqualsBuilder().append(blockNumber, rhs.blockNumber).append(timeStamp, rhs.timeStamp).append(hash, rhs.hash).append(nonce, rhs.nonce).append(blockHash, rhs.blockHash).append(transactionIndex, rhs.transactionIndex).append(from, rhs.from).append(to, rhs.to).append(value, rhs.value).append(gas, rhs.gas).append(gasPrice, rhs.gasPrice).append(isError, rhs.isError).append(input, rhs.input).append(contractAddress, rhs.contractAddress).append(cumulativeGasUsed, rhs.cumulativeGasUsed).append(gasUsed, rhs.gasUsed).append(confirmations, rhs.confirmations).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
