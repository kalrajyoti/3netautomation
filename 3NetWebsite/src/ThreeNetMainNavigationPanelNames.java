import com.test.ParentForAll;


public class ThreeNetMainNavigationPanelNames extends ParentForAll {
	String [] col1;
	String[] col2;
	String[] col3;




	ThreeNetMainNavigationPanelNames(String panelHeadingName,String [] col1,String[] col2,String[] col3)
	{
		this.name = panelHeadingName;
		this.col1 = col1;
		this.col2 = col2;
		this.col3 = col3;
	}
	public void displayPanelHeadingNames()
	{


		System.out.println(name);
		System.out.println("-----------------------------------");

		for(int count =0;count<col1.length;count++)
		{
			
				if(col1 != null && count < col1.length){
					System.out.print(col1[count]);
				}
				if(col2 != null && count < col2.length){
					System.out.print("\t\t\t\t\t" + col2[count]);
				}
				if(col3 != null && count < col3.length){
					System.out.println("\t\t\t\t\t" + col3[count]);
				}
			
			System.out.println("");

		}
		System.out.println("");




		/*for(int count =0;count<col2.length;count++)
		{
			System.out.print(col2[count]+ "                      " );

		}

		System.out.println("");

		for(int count =0;count<col3.length;count++)
		{
			System.out.print(col3[count]+ "                      " );

		}

		System.out.println("");

		/*for(int count=0;count<secondcolum.length;count++)
		{
			System.out.println(secondcolum[count]);
		}
		System.out.print("");
		for(int count=0;count<thirdcolum.length;count++)
		{
			System.out.println(thirdcolum[count]);
		}
	}*/



	}
}

