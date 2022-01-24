import java.util.*;

class ordinal{
	int num,last=0,s_last=0,cpy,count=0;
	Scanner sc = new Scanner(System.in);
	public void getNum(){
		System.out.print("\n Enter Any Number : ");
		num = sc.nextInt();
	}
	public int processNum(){
		if(num < 0)
			return 0;
		else if(num < 10)
			return num;
		count = 9;
		int flag =0,recur = 11, val = 11;
		while(val<=num){
			if(flag == 9){
				recur = recur*10+1;
				flag=0;
				val = recur;
				if(val>num)
					break;
			}
			flag++;
			count++;
			val += recur;
		}
		return count;
	}
}
class ordinalques{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n,res;
		System.out.print("\n Enter Number Of Test Cases : ");
		n = sc.nextInt();
		ordinal ord[] =  new ordinal[n];
		for(int i=0;i<n;i++){
			System.out.println("\n Test Case Number "+ (i+1));
			ord[i] = new ordinal();
			ord[i].getNum();
			res = ord[i].processNum();
			System.out.print("\n Number Of Ordinals are : "+res);
		}
	}
}
