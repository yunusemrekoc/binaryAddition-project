package binaryAddition;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		int i;
		int[] a = new int[16]; 
		int[] b = new int[16]; 
		int[] sum = new int[16]; 
		String c, d;
		Scanner sn = new Scanner(System.in);
		Methods m = new Methods();
		System.out.println("Enter the 1st 8 bit binary number: ");
		c = sn.nextLine();
		a = m.Converter(c);
		System.out.println("Enter the 2nd 8 bit binary number: ");
		d = sn.nextLine();
		b = m.Converter(d);
		sum = m.BinaryAddition(a, b);
		for (i = 0; i < a.length; i++) {
			System.out.print(sum[i]);
			}
		}
	} 




class Methods { 
	int[] sum;
	int[] BinaryAddition(int[] a, int[] b) {
		sum = new int[16]; 
		int cry = 0;
		for (int i = a.length-1; i >= 0; i--) { 
			if (cry == 0 && a[i] == 0 && b[i] == 0) { 
				sum[i] = 0; cry = 0;
	
	}

 else if (cry == 0 && a[i] == 0 && b[i] == 1) {
	sum[i] = 1;
	cry = 0;
	} else if (cry == 0 && a[i] == 1 && b[i] == 0) {
		sum[i] = 1; cry = 0;
		} else if (cry == 0 && a[i] == 1 && b[i] == 1) { 
			sum[i] = 0; cry = 1;
			} else if (cry == 1 && a[i] == 0 && b[i] == 0) {
				sum[i] = 1;
				cry = 0; 
				} else if (cry == 1 && a[i] == 0 && b[i] == 1) {
					sum[i] = 0;
					cry = 1; 
					} else if (cry == 1 && a[i] == 0 && b[i] == 0) {
						sum[i] = 1;
						cry = 0;
						} else if (cry == 1 && a[i] == 1 && b[i] == 1) {
							sum[i] = 1;
							cry = 1;
							} 
}
System.out.println("\n"); 
System.out.println("Sum : ");
System.out.print(cry+"\t"); 
return (sum);
}
int[] Converter(String s) {
	int[] a = new int[16];
	for (int i = 0; i < s.length(); i++) {
			if ((s.charAt(i)) == '0'){
				a[i] = 0;
		} else if ((s.charAt(i)) == '1') {
			a[i] = 1;
			} else { System.out.println("Error: Binary includes only 1 and 0. Run Again! ");
			System.exit(1);
			}
		} 
		return a;
	}
}
		
		
