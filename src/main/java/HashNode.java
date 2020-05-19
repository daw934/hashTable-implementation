public class HashNode {
    String key;
    Person value;
    HashNode next;

    public HashNode(String key, Person value) {
        this.key = key;
        this.value = value;
        next = null;
    }

    @Override
    public String toString() {
        return "HashNode{" +
                "key='" + key + '\'' +
                ", value=" + value +
                ", next=" + next +
                '}';
    }
}
