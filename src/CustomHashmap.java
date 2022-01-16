public class CustomHashmap {

    Object[][] arr = new Object[10][5];

    public void put(String key, String value) {
        int i = key.hashCode();
        Object[] ar = {key, value};
        arr[i] = ar;
    }

    public String get(String key) {
        int index = key.hashCode();
        Object[] arr1 = arr[index];
        return (String) arr1[1];
    }
}
