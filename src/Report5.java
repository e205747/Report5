public class Report5{
    public static void main(String[] args){
        try{
            String str = "百二十三";
            int value = Integer.parseInt(str);
            System.out.println(str.length());
        }catch (NullPointerException e){
            System.out.println("例外：NullPointerExceptionが発生しました。");
            System.out.println(e.getMessage());
        }
        
    }
}