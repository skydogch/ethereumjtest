package org.ethereum.jsontestsuite.model;

public class BlockHeaderTck {

    String bloom;
    String coinbase;
    String difficulty;
    String extraData;
    String gasLimit;
    String gasUsed;
    String hash;
    String mixHash;
    String nonce;
    String number;
    String parentHash;
    String receiptTrie;
    String seedHash;
    String stateRoot;
    String timestamp;
    String transactionsTrie;
    String uncleHash;

    public BlockHeaderTck() {
    }

    public String getBloom() {
        return bloom;
    }

    public void setBloom(String bloom) {
        this.bloom = bloom;
    }

    public String getCoinbase() {
        return coinbase;
    }

    public void setCoinbase(String coinbase) {
        this.coinbase = coinbase;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public String getExtraData() {
        return extraData;
    }

    public void setExtraData(String extraData) {
        this.extraData = extraData;
    }

    public String getGasLimit() {
        return gasLimit;
    }

    public void setGasLimit(String gasLimit) {
        this.gasLimit = gasLimit;
    }

    public String getGasUsed() {
        return gasUsed;
    }

    public void setGasUsed(String gasUsed) {
        this.gasUsed = gasUsed;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public String getMixHash() {
        return mixHash;
    }

    public void setMixHash(String mixHash) {
        this.mixHash = mixHash;
    }

    public String getNonce() {
        return nonce;
    }

    public void setNonce(String nonce) {
        this.nonce = nonce;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getParentHash() {
        return parentHash;
    }

    public void setParentHash(String parentHash) {
        this.parentHash = parentHash;
    }

    public String getReceiptTrie() {
        return receiptTrie;
    }

    public void setReceiptTrie(String receiptTrie) {
        this.receiptTrie = receiptTrie;
    }

    public String getSeedHash() {
        return seedHash;
    }

    public void setSeedHash(String seedHash) {
        this.seedHash = seedHash;
    }

    public String getStateRoot() {
        return stateRoot;
    }

    public void setStateRoot(String stateRoot) {
        this.stateRoot = stateRoot;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getTransactionsTrie() {
        return transactionsTrie;
    }

    public void setTransactionsTrie(String transactionsTrie) {
        this.transactionsTrie = transactionsTrie;
    }

    public String getUncleHash() {
        return uncleHash;
    }

    public void setUncleHash(String uncleHash) {
        this.uncleHash = uncleHash;
    }

    @Override
    public String toString() {
        return "BlockHeader{" +
                "bloom='" + bloom + '\'' +
                ", coinbase='" + coinbase + '\'' +
                ", difficulty='" + difficulty + '\'' +
                ", extraData='" + extraData + '\'' +
                ", gasLimit='" + gasLimit + '\'' +
                ", gasUsed='" + gasUsed + '\'' +
                ", hash='" + hash + '\'' +
                ", mixHash='" + mixHash + '\'' +
                ", nonce='" + nonce + '\'' +
                ", number='" + number + '\'' +
                ", parentHash='" + parentHash + '\'' +
                ", receiptTrie='" + receiptTrie + '\'' +
                ", seedHash='" + seedHash + '\'' +
                ", stateRoot='" + stateRoot + '\'' +
                ", timestamp='" + timestamp + '\'' +
                ", transactionsTrie='" + transactionsTrie + '\'' +
                ", uncleHash='" + uncleHash + '\'' +
                '}';
    }
}
