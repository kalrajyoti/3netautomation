
public class ThreeNetMainNavigationPanelDetails {

	ThreeNetMainNavigationPanelNames myTaskheading;
	ThreeNetMainNavigationPanelNames DiscussionHeading;
	ThreeNetMainNavigationPanelNames NewsLettersheading;
	

	
	       
	       
	       ThreeNetMainNavigationPanelDetails()
	       
	       {
	    	   String[] myTaskColoumName = {"Type", "Approve Attendance"," Approve Leaves"};
	    	   String[] firstHeadercoloum1Detail = {"Details","No Pending request","no pending request"};
	    
	    	 myTaskheading = new ThreeNetMainNavigationPanelNames("My Task",myTaskColoumName,firstHeadercoloum1Detail,null);
	    	 
	    	 String[] DiscussionColoumName = {"Title", "Selling my six month old Hyundai Xcent","Oops! No Holiday on Rakshabandhan..     "};
	    	 String[] secondheadersecondcolumsDetail = {"Hits|Replies" ,"68 | 0","70|8"}; 
	    	 String[] secondheaderThirdcolumnDetail ={"Author Name", "Rajesh Kumar (Aug 03, 05:12 PM)","Jyoti kalra (Aug 09, 7:09 PM"};
	    	 DiscussionHeading = new ThreeNetMainNavigationPanelNames("Discussion",DiscussionColoumName,secondheadersecondcolumsDetail,secondheaderThirdcolumnDetail);
	    	  String[] newsLetterColoumName = {"3Pedia", "3Pedia, March 2015      ","3Pedia, February 2015"};
	    	 String[] thirdHeadercoloum1Detail = {"Competency Center","Issue 3, November 2013" ,"Issue 2 , November 2013"};
	    	 String[] thirdheaderThirdcolumnDetail = {"Labs","Issue 2, June 2013 ", "Issue 1, April 2013"};
	    	 NewsLettersheading = new ThreeNetMainNavigationPanelNames("NewsLetters",newsLetterColoumName,thirdHeadercoloum1Detail,thirdheaderThirdcolumnDetail);
	    	   
	       }
	       
	     void displayHeadings()
	     {  System.out.println("<---------ThreeNet Main Navigation Content Started------>");
	    	myTaskheading.displayPanelHeadingNames();
	    	DiscussionHeading.displayPanelHeadingNames();
	    	 NewsLettersheading.displayPanelHeadingNames();
	    	 System.out.println("<---------ThreeNet Main Navigation Content finished------>"); 
	    	 
	     }
	       
	       
}
