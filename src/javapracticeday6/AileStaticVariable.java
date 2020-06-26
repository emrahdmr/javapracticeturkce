package javapracticeday6;

public class AileStaticVariable {
	
	static int ailepizzasi = 8;
	int bireyselpizza = 8;

	public static void main(String[] args) {

		
		
		AileStaticVariable cocuk = new AileStaticVariable();
		
		cocuk.ailepizzasi -= 2;
		cocuk.bireyselpizza -= 2;
		
		System.out.println(cocuk.ailepizzasi);
		System.out.println(cocuk.bireyselpizza);
		
		
        AileStaticVariable anne = new AileStaticVariable();
		
		anne.ailepizzasi -= 2;
		anne.bireyselpizza -= 2;
		
		System.out.println(anne.ailepizzasi);
		System.out.println(anne.bireyselpizza);
		
AileStaticVariable baba = new AileStaticVariable();
		
		baba.ailepizzasi -= 2;
		baba.bireyselpizza -= 2;
		
		System.out.println(baba.ailepizzasi);
		System.out.println(baba.bireyselpizza);
		
		
		//static her seferinde   + veya - ye bagli olarrak degisir
		
	}

}
