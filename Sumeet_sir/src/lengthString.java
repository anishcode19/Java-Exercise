public class lengthString {
    
 public static void main(String[] args) {
		String test = "galgotias university";
		count(test);
    }
    
    public static void count(String x){
		char[] ch = x.toCharArray();
		int letter = 0;
		
		for(int i = 0; i < x.length(); i++){
			if(Character.isLetter(ch[i])){
				letter ++ ;
			}	
        }
        int result = digSum(letter);
        System.out.println(result);

    }
    public static int digSum(int n) 
    { 
        int sum = 0; 
  
        // Loop to do sum while 
        // sum is not less than 
        // or equal to 9 
        while (n > 0 || sum > 9)  
        { 
            if (n == 0) { 
                n = sum; 
                sum = 0; 
            } 
            sum += n % 10; 
            n /= 10; 
        } 
        return sum; 
    } 
}