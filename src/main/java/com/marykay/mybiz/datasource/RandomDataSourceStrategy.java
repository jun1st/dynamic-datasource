package com.marykay.mybiz.datasource;


import java.util.concurrent.ThreadLocalRandom;

/**
 * Randomly pick a slave as datasource
 * @author fengde
 */
public class RandomDataSourceStrategy implements DynamicDataSourceStrategy {

    @Override
    public String determineSlaveDataSource(String[] slaveDataSourceLookupKeys) {
        int i = ThreadLocalRandom.current().nextInt(slaveDataSourceLookupKeys.length);

        return slaveDataSourceLookupKeys[i];
    }
}
