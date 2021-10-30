package store;

public class Store {
    public boolean search(FlowerBucket bucket) {
        //here you can add buckets to the store.
        FlowerBucket[] AllBuckets = new FlowerBucket[] {};
        for (FlowerBucket store_bucket : AllBuckets) {
            if (store_bucket.toString().equals(bucket.toString())) {
                return true;
            }
        }
        return false;
    }
}
