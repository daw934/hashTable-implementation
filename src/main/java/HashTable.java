public class HashTable {
    private static int TABLE_SIZE = 8;
    private HashNode[] buckets = new HashNode[TABLE_SIZE];


    public void put(String key, Person value) {
        int hash = getHashCode(key);
        var node = new HashNode(key, value);
        HashNode bucketNode = buckets[hash];
        if (bucketNode == null) {
            buckets[hash] = node;
        } else {
            HashNode temp = bucketNode;
            while (temp.next != null && !temp.key.equals(key)) {
                temp = temp.next;
            }
            temp.next = node;
        }
    }

    public Person get(String key) {
        int hash = getHashCode(key);
        System.out.println("Getting bucket using hashcode");
        HashNode node = buckets[hash];
        while (node != null) {
            System.out.println("Checking the node key taken from the bucket");
            if(node.key.equals(key)){
                System.out.println("Correct person was found; Person: " + node.value);
                return node.value;
            }else {
                System.out.println("The node key is not correct, getting next one");
                node = node.next;
            }
        }
        System.out.println("Value was not found for key: " + key);
        return null;
    }

    private int getHashCode(String key) {
        System.out.println("Counting hashcode....");
        int hashcode = Math.abs(key.hashCode() % TABLE_SIZE);
        System.out.println("hashcode equals = " + hashcode + " for key: " + key);
        return hashcode;
    }
}
