package String;
//查找字符串最后一次出现位置
public class StringLastIndex {
    public static void main(String[] args) {
        String strOrig = "Hello world ,Hello Reader";
        int lastIndex = strOrig.lastIndexOf("Hello");
        if(lastIndex == - 1){
            System.out.println("Hello not found");
        }else{
            System.out.println("Last occurrence of Hello is at index "+ lastIndex);
        }
    }
}
