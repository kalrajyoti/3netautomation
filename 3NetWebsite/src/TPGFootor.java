
public class TPGFootor {
	TPGFooterColor tpgFootercolor;
	TPGFooterContent tpgFootercontent;
	
	TPGFootor()
	{
		tpgFootercolor = new TPGFooterColor();
		tpgFootercontent = new TPGFooterContent();
	}
	void display()
	{
		tpgFootercolor.displayFooterColor();
		tpgFootercontent.displayFooterText();
		
	}
}
