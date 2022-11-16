
public class Scale {
	//protected String[] CHROMATIC = {"C","C#","D","E","F","G","A","B","C"};
	protected static String[] CMAJOR ={"C","D","E","F","G","A","B"};
	protected static String[] DMAJOR ={"D","E","F#","G","A","B","C#"};
	protected static String[] EMAJOR ={"E","F#","G#","A","B","C#","D#"};
	protected static String[] FMAJOR ={"F","G","A","Bb","C","D","E",};
	protected static String[] GMAJOR ={"G","A","B","C", "D", "E", "F#"};
	protected static String[] AMAJOR ={"A","B","C#", "D", "E", "F#", "G#"};
	protected static String[] BMAJOR ={"B","C#","D#","E","F#","G#","A#"};
	protected static String[] DbMAJOR ={"Db","Eb","F","Gb","Ab","Bb","C"};
	protected static String[] EbMAJOR ={"Eb","F","G","Ab","Bb","C","D"};
	protected static String[] GbMAJOR ={"F#","G#","A#","B","C#","D#","E#",};
	protected static String[] AbMAJOR ={"Ab","Bb","C","D","Eb","F","G",};
	protected static String[] BbMAJOR ={"Bb","C","D","Eb","F","G","A"};
	
	protected static int[] CMAJORSEMI = Demo.convertToSemi(CMAJOR);
	protected static int[] DMAJORSEMI = Demo.convertToSemi(DMAJOR);
	protected static int[] EMAJORSEMI = Demo.convertToSemi(EMAJOR);
	protected static int[] FMAJORSEMI = Demo.convertToSemi(FMAJOR);
	protected static int[] GMAJORSEMI = Demo.convertToSemi(GMAJOR);
	protected static int[] AMAJORSEMI = Demo.convertToSemi(AMAJOR);
	protected static int[] BMAJORSEMI = Demo.convertToSemi(BMAJOR);
	protected static int[] DbMAJORSEMI = Demo.convertToSemi(DbMAJOR);
	protected static int[] EbMAJORSEMI = Demo.convertToSemi(EbMAJOR);
	protected static int[] GbMAJORSEMI = Demo.convertToSemi(GbMAJOR);
	protected static int[] AbMAJORSEMI = Demo.convertToSemi(AbMAJOR);
	protected static int[] BbMAJORSEMI = Demo.convertToSemi(BbMAJOR);
	
	
	int y = Demo.x;
}
