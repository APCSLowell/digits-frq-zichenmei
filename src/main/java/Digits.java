import java.util.ArrayList;

public class Digits
{

	private ArrayList<Integer> digitList;

	public Digits(int num)
	{ /* to be implemented in part (a) */ 
	digitList=new ArrayList<Integer>();
	if(num==0){
	  digitList.add(0);
	}  
	int nNum=num;
	while(nNum>0){
		digitList.add(0,nNum%10);
		nNum=nNum/10;
	}
	}

	public boolean isStrictlyIncreasing()
	{ /* to be implemented in part (b) */
		for(int i=1;i<digitList.size();i++){
			if(digitList.get(i)<=digitList.get(i-1)){
				return false;
			}
		}return true;

	}
	
	public String toString()
	{
		return digitList.toString();
	}
}
