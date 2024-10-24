import java.util.*;
public class tictac{
	public static void table(int [][] tabl){
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				if(tabl[i][j]==1){
					System.out.print(" X ");
				}
				else if(tabl[i][j]==2){
					System.out.print(" O ");
				}
				else{
					System.out.print("   ");
				}
				if(j!=2){
				System.out.print("|");
			}
			}
			System.out.println();
		for(int p=0;p<3;p++){
			System.out.print("___");
			if(p!=2){
			System.out.print("+");

			}
		}
		System.out.println();
		}
		
	}
	public static int check(int[][] table){
		for(int i=0;i<3;i++){
		if(table[i][0]==table[i][1] && table[i][1]==table[i][2]){
			if(table[i][0]==1){
				System.out.println("X Won");
			}
			else{
				System.out.println("O Won");
			}
				System.out.println("first");

			return 1;
		}
		if(table[0][i]==table[1][i] && table[1][i]==table[2][i]){
			if(table[0][i]==1){
				System.out.println("X Won");
			}
			else{
				System.out.println("O Won");
			}
				System.out.println("2");

			return 1;
		}
		if(table[1][1]==table[2][2] && table[2][2]==table[0][0]){
			if(table[0][0]==1){
				System.out.println("X Won");
			}
			else{
				System.out.println("O Won");
			}
				System.out.println("3");
			return 1;
		}
		if(table[2][0]==table[1][1] && table[1][1]==table[0][2]){
			if(table[2][0]==1){
				System.out.println("X Won");
			}
			else{
				System.out.println("O Won");
			}
				System.out.println("last");

			return 1;
		}
		
	}
	return 0;
	}
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int x=0;
		int y=0;
		int[][] tab=new int[3][3];
		for(int i=0;i<9;){
			System.out.println("enter the index to enter");
			x=in.nextInt();
			y=in.nextInt();
			if(x>2 || y>2){
				System.out.println("enter no. less than 2");
				continue;
			}
			if(tab[x][y]==1 || tab[x][y]==2){
				System.out.println("position already occupied");
				continue;
			}
			
			if(i%2==0){
			tab[x][y]=1;
		}
		else{
			tab[x][y]=2;
		}
		table(tab);
		if(i>=5){
			if(check(tab)==1){
				System.exit(0);
			}
		}
		i++;
		}
	}
}