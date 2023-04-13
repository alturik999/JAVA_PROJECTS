package Home_work_Lesson_1;

public class HW2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        
        for (int i = 0; i < n; i++) {
           numbers[i] = scanner.nextInt();
        }
  
  
        int multiplier = scanner.nextInt();
        for (int i = 0; i < n; i++) {
           System.out.println(numbers[i] * multiplier);
        }
        
      }
}
