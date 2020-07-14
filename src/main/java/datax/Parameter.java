/**
  * Copyright 2020 bejson.com 
  */
package datax;
import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

/**
 * Auto-generated: 2020-07-13 11:19:37
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class Parameter {

    private ImpalaConfig impalaConfig;
    private boolean isAddTimes;
    private String impalaDataBase;
    private List<Column> column;
    private String impalaTableName;
    private boolean isUpsert;
    @JSONField(name = "batch-size")
    private int batchSize;
    private int mutationBufferSpace;
    private boolean isSyncBlob;
    private boolean initTable;
    private String masterAddr;
    public void setImpalaConfig(ImpalaConfig impalaConfig) {
         this.impalaConfig = impalaConfig;
     }
     public ImpalaConfig getImpalaConfig() {
         return impalaConfig;
     }

    public void setIsAddTimes(boolean isAddTimes) {
         this.isAddTimes = isAddTimes;
     }
     public boolean getIsAddTimes() {
         return isAddTimes;
     }

    public void setImpalaDataBase(String impalaDataBase) {
         this.impalaDataBase = impalaDataBase;
     }
     public String getImpalaDataBase() {
         return impalaDataBase;
     }

    public void setColumn(List<Column> column) {
         this.column = column;
     }
     public List<Column> getColumn() {
         return column;
     }

    public void setImpalaTableName(String impalaTableName) {
         this.impalaTableName = impalaTableName;
     }
     public String getImpalaTableName() {
         return impalaTableName;
     }

    public void setIsUpsert(boolean isUpsert) {
         this.isUpsert = isUpsert;
     }
     public boolean getIsUpsert() {
         return isUpsert;
     }

    public boolean isAddTimes() {
        return isAddTimes;
    }

    public void setAddTimes(boolean addTimes) {
        isAddTimes = addTimes;
    }

    public boolean isUpsert() {
        return isUpsert;
    }

    public void setUpsert(boolean upsert) {
        isUpsert = upsert;
    }

    public int getBatchSize() {
        return batchSize;
    }

    public void setBatchSize(int batchSize) {
        this.batchSize = batchSize;
    }

    public boolean isSyncBlob() {
        return isSyncBlob;
    }

    public void setSyncBlob(boolean syncBlob) {
        isSyncBlob = syncBlob;
    }

    public boolean isInitTable() {
        return initTable;
    }

    public void setMutationBufferSpace(int mutationBufferSpace) {
         this.mutationBufferSpace = mutationBufferSpace;
     }
     public int getMutationBufferSpace() {
         return mutationBufferSpace;
     }

    public void setIsSyncBlob(boolean isSyncBlob) {
         this.isSyncBlob = isSyncBlob;
     }
     public boolean getIsSyncBlob() {
         return isSyncBlob;
     }

    public void setInitTable(boolean initTable) {
         this.initTable = initTable;
     }
     public boolean getInitTable() {
         return initTable;
     }

    public void setMasterAddr(String masterAddr) {
         this.masterAddr = masterAddr;
     }
     public String getMasterAddr() {
         return masterAddr;
     }

}