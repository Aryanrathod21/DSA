public class moveX {
    public static void move(String str,int idx,int counter,String newStr){
        if (idx == str.length()) {
            for(int i = 0 ; i < counter ; i++ ){
                newStr += 'x';
            }
            System.out.println(newStr);
            return;
        }
        char currCar = str.charAt(idx); 
        if (currCar == 'x') {
            counter++;
            move(str, idx+1, counter, newStr);
        }else{
            newStr += currCar;
            move(str, idx+1, counter, newStr);
        }
    }
    public static void main(String[] args) {
        String str = "axbcxdcxy";
        move(str, 0, 0, "");
    }
}
