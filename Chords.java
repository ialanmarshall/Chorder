import java.util.ArrayList;
public class Chords {
	public Chords() {
		
	}
	//Should return a string array of all notes where major scales work
	public static ArrayList<String> major(int[] scale){
		ArrayList<String> chordsAllowed = new ArrayList<String>();
		
		for (int i =0; i < scale.length; i++) {
			switch(scale[i]) {
			case 0: 
				
				int[] Cmajor = {Scale.CMAJORSEMI[0], Scale.CMAJORSEMI[2], Scale.CMAJORSEMI[4]};
				boolean isValid = true;
				for(int j=0; j< Cmajor.length; j++) {
					boolean isFound = false;
					for (int k =0; k < scale.length; k++) {
						if(Cmajor[j] == scale[k]) {
							isFound = true;
						}
						if (isFound == false && k == scale.length-1) {
							isValid = false;
						}
					}
				}
				if (isValid == true) {
					chordsAllowed.add("C");
				}
				break;
			case 1:
				int[] Dbmajor = {Scale.DbMAJORSEMI[0], Scale.DbMAJORSEMI[2], Scale.DbMAJORSEMI[4]};
				 isValid = true;
				for(int j=0; j< Dbmajor.length; j++) {
					boolean isFound = false;
					for (int k =0; k < scale.length; k++) {
						if(Dbmajor[j] == scale[k]) {
							isFound = true;
						}
						if (isFound == false && k == scale.length-1) {
							isValid = false;
						}
					}
				}
				if (isValid == true) {
					chordsAllowed.add("Db");

				}
				break;
			case 2:
				int[] Dmajor = {Scale.DMAJORSEMI[0], Scale.DMAJORSEMI[2], Scale.DMAJORSEMI[4]};
				 isValid = true;
				for(int j=0; j< Dmajor.length; j++) {
					boolean isFound = false;
					for (int k =0; k < scale.length; k++) {
						if(Dmajor[j] == scale[k]) {
							isFound = true;
						}
						if (isFound == false && k == scale.length-1) {
							isValid = false;
						}
					}
				}
				if (isValid == true) {
					chordsAllowed.add("D");

				}
				break;
			case 3:
				int[] Ebmajor = {Scale.EbMAJORSEMI[0], Scale.EbMAJORSEMI[2], Scale.EbMAJORSEMI[4]};
				 isValid = true;
				for(int j=0; j< Ebmajor.length; j++) {
					boolean isFound = false;
					for (int k =0; k < scale.length; k++) {
						if(Ebmajor[j] == scale[k]) {
							isFound = true;
						}
						if (isFound == false && k == scale.length-1) {
							isValid = false;
						}
					}
				}
				if (isValid == true) {
					chordsAllowed.add("Eb");

				}
				break;
			case 4:
				int[] Emajor = {Scale.EMAJORSEMI[0], Scale.EMAJORSEMI[2], Scale.EMAJORSEMI[4]};
				 isValid = true;
				for(int j=0; j< Emajor.length; j++) {
					boolean isFound = false;
					for (int k =0; k < scale.length; k++) {
						if(Emajor[j] == scale[k]) {
							isFound = true;
						}
						if (isFound == false && k == scale.length-1) {
							isValid = false;
						}
					}
				}
				if (isValid == true) {
					chordsAllowed.add("E");

				}
				break;
			case 5:
				int[] Fmajor = {Scale.FMAJORSEMI[0], Scale.FMAJORSEMI[2], Scale.FMAJORSEMI[4]};
				 isValid = true;
				for(int j=0; j< Fmajor.length; j++) {
					boolean isFound = false;
					for (int k =0; k < scale.length; k++) {
						if(Fmajor[j] == scale[k]) {
							isFound = true;
						}
						if (isFound == false && k == scale.length-1) {
							isValid = false;
						}
					}
				}
				if (isValid == true) {
					chordsAllowed.add("F");

				}
				break;
			case 6:
				int[] Gbmajor = {Scale.GbMAJORSEMI[0], Scale.GbMAJORSEMI[2], Scale.GbMAJORSEMI[4]};
				 isValid = true;
				for(int j=0; j< Gbmajor.length; j++) {
					boolean isFound = false;
					for (int k =0; k < scale.length; k++) {
						if(Gbmajor[j] == scale[k]) {
							isFound = true;
						}
						if (isFound == false && k == scale.length-1) {
							isValid = false;
						}
					}
				}
				if (isValid == true) {
					chordsAllowed.add("F#");

				}
				break;
			case 7:
				int[] Gmajor = {Scale.GMAJORSEMI[0], Scale.GMAJORSEMI[2], Scale.GMAJORSEMI[4]};
				 isValid = true;
				for(int j=0; j< Gmajor.length; j++) {
					boolean isFound = false;
					for (int k =0; k < scale.length; k++) {
						if(Gmajor[j] == scale[k]) {
							isFound = true;
						}
						if (isFound == false && k == scale.length-1) {
							isValid = false;
						}
					}
				}
				if (isValid == true) {
					chordsAllowed.add("G");

				}
				break;
			case 8:
				int[] Abmajor = {Scale.AbMAJORSEMI[0], Scale.AbMAJORSEMI[2], Scale.AbMAJORSEMI[4]};
				 isValid = true;
				for(int j=0; j< Abmajor.length; j++) {
					boolean isFound = false;
					for (int k =0; k < scale.length; k++) {
						if(Abmajor[j] == scale[k]) {
							isFound = true;
						}
						if (isFound == false && k == scale.length-1) {
							isValid = false;
						}
					}
				}
				if (isValid == true) {
					chordsAllowed.add("Ab");

				}
				break;
			case 9:
				int[] Amajor = {Scale.AMAJORSEMI[0], Scale.AMAJORSEMI[2], Scale.AMAJORSEMI[4]};
				 isValid = true;
				for(int j=0; j< Amajor.length; j++) {
					boolean isFound = false;
					for (int k =0; k < scale.length; k++) {
						if(Amajor[j] == scale[k]) {
							isFound = true;
						}
						if (isFound == false && k == scale.length-1) {
							isValid = false;
						}
					}
				}
				if (isValid == true) {
					chordsAllowed.add("A");

				}
				break;
			case 10:
				int[] Bbmajor = {Scale.BbMAJORSEMI[0], Scale.BbMAJORSEMI[2], Scale.BbMAJORSEMI[4]};
				 isValid = true;
				for(int j=0; j< Bbmajor.length; j++) {
					boolean isFound = false;
					for (int k =0; k < scale.length; k++) {
						if(Bbmajor[j] == scale[k]) {
							isFound = true;
						}
						if (isFound == false && k == scale.length-1) {
							isValid = false;
						}
					}
				}
				if (isValid == true) {
					chordsAllowed.add("Bb");

				}
				break;
			case 11:
				int[] Bmajor = {Scale.BMAJORSEMI[0], Scale.BMAJORSEMI[2], Scale.BMAJORSEMI[4]};
				 isValid = true;
				for(int j=0; j< Bmajor.length; j++) {
					boolean isFound = false;
					for (int k =0; k < scale.length; k++) {
						if(Bmajor[j] == scale[k]) {
							isFound = true;
						}
						if (isFound == false && k == scale.length-1) {
							isValid = false;
						}
					}
				}
				if (isValid == true) {
					chordsAllowed.add("B");

				}
				break;
				
			}	
			
		}
		return chordsAllowed;
	}
	public static ArrayList<String> minor(int[] scale){
ArrayList<String> chordsAllowed = new ArrayList<String>();
		
		for (int i =0; i < scale.length; i++) {
			switch(scale[i]) {
			case 0: 
				
				int[] Cmajor = {Scale.CMAJORSEMI[0], Scale.CMAJORSEMI[2]-1, Scale.CMAJORSEMI[4]};
				boolean isValid = true;
				for(int j=0; j< Cmajor.length; j++) {
					boolean isFound = false;
					for (int k =0; k < scale.length; k++) {
						if(Cmajor[j] == scale[k]) {
							isFound = true;
						}
						if (isFound == false && k == scale.length-1) {
							isValid = false;
						}
					}
				}
				if (isValid == true) {
					chordsAllowed.add("C");
				}
				break;
			case 1:
				int[] Dbmajor = {Scale.DbMAJORSEMI[0], Scale.DbMAJORSEMI[2]-1, Scale.DbMAJORSEMI[4]};
				 isValid = true;
				for(int j=0; j< Dbmajor.length; j++) {
					boolean isFound = false;
					for (int k =0; k < scale.length; k++) {
						if(Dbmajor[j] == scale[k]) {
							isFound = true;
						}
						if (isFound == false && k == scale.length-1) {
							isValid = false;
						}
					}
				}
				if (isValid == true) {
					chordsAllowed.add("Db");

				}
				break;
			case 2:
				int[] Dmajor = {Scale.DMAJORSEMI[0], Scale.DMAJORSEMI[2]-1, Scale.DMAJORSEMI[4]};
				 isValid = true;
				for(int j=0; j< Dmajor.length; j++) {
					boolean isFound = false;
					for (int k =0; k < scale.length; k++) {
						if(Dmajor[j] == scale[k]) {
							isFound = true;
						}
						if (isFound == false && k == scale.length-1) {
							isValid = false;
						}
					}
				}
				if (isValid == true) {
					chordsAllowed.add("D");

				}
				break;
			case 3:
				int[] Ebmajor = {Scale.EbMAJORSEMI[0], Scale.EbMAJORSEMI[2]-1, Scale.EbMAJORSEMI[4]};
				 isValid = true;
				for(int j=0; j< Ebmajor.length; j++) {
					boolean isFound = false;
					for (int k =0; k < scale.length; k++) {
						if(Ebmajor[j] == scale[k]) {
							isFound = true;
						}
						if (isFound == false && k == scale.length-1) {
							isValid = false;
						}
					}
				}
				if (isValid == true) {
					chordsAllowed.add("Eb");

				}
				break;
			case 4:
				int[] Emajor = {Scale.EMAJORSEMI[0], Scale.EMAJORSEMI[2]-1, Scale.EMAJORSEMI[4]};
				 isValid = true;
				for(int j=0; j< Emajor.length; j++) {
					boolean isFound = false;
					for (int k =0; k < scale.length; k++) {
						if(Emajor[j] == scale[k]) {
							isFound = true;
						}
						if (isFound == false && k == scale.length-1) {
							isValid = false;
						}
					}
				}
				if (isValid == true) {
					chordsAllowed.add("E");

				}
				break;
			case 5:
				int[] Fmajor = {Scale.FMAJORSEMI[0], Scale.FMAJORSEMI[2]-1, Scale.FMAJORSEMI[4]};
				 isValid = true;
				for(int j=0; j< Fmajor.length; j++) {
					boolean isFound = false;
					for (int k =0; k < scale.length; k++) {
						if(Fmajor[j] == scale[k]) {
							isFound = true;
						}
						if (isFound == false && k == scale.length-1) {
							isValid = false;
						}
					}
				}
				if (isValid == true) {
					chordsAllowed.add("F");

				}
				break;
			case 6:
				int[] Gbmajor = {Scale.GbMAJORSEMI[0], Scale.GbMAJORSEMI[2]-1, Scale.GbMAJORSEMI[4]};
				 isValid = true;
				for(int j=0; j< Gbmajor.length; j++) {
					boolean isFound = false;
					for (int k =0; k < scale.length; k++) {
						if(Gbmajor[j] == scale[k]) {
							isFound = true;
						}
						if (isFound == false && k == scale.length-1) {
							isValid = false;
						}
					}
				}
				if (isValid == true) {
					chordsAllowed.add("F#");

				}
				break;
			case 7:
				int[] Gmajor = {Scale.GMAJORSEMI[0], Scale.GMAJORSEMI[2]-1, Scale.GMAJORSEMI[4]};
				 isValid = true;
				for(int j=0; j< Gmajor.length; j++) {
					boolean isFound = false;
					for (int k =0; k < scale.length; k++) {
						if(Gmajor[j] == scale[k]) {
							isFound = true;
						}
						if (isFound == false && k == scale.length-1) {
							isValid = false;
						}
					}
				}
				if (isValid == true) {
					chordsAllowed.add("G");

				}
				break;
			case 8:
				int[] Abmajor = {Scale.AbMAJORSEMI[0], Scale.AbMAJORSEMI[2]-1, Scale.AbMAJORSEMI[4]};
				 isValid = true;
				for(int j=0; j< Abmajor.length; j++) {
					boolean isFound = false;
					for (int k =0; k < scale.length; k++) {
						if(Abmajor[j] == scale[k]) {
							isFound = true;
						}
						if (isFound == false && k == scale.length-1) {
							isValid = false;
						}
					}
				}
				if (isValid == true) {
					chordsAllowed.add("Ab");

				}
				break;
			case 9:
				int[] Amajor = {Scale.AMAJORSEMI[0], Scale.AMAJORSEMI[2]-1, Scale.AMAJORSEMI[4]};
				 isValid = true;
				for(int j=0; j< Amajor.length; j++) {
					boolean isFound = false;
					for (int k =0; k < scale.length; k++) {
						if(Amajor[j] == scale[k]) {
							isFound = true;
						}
						if (isFound == false && k == scale.length-1) {
							isValid = false;
						}
					}
				}
				if (isValid == true) {
					chordsAllowed.add("A");

				}
				break;
			case 10:
				int[] Bbmajor = {Scale.BbMAJORSEMI[0], Scale.BbMAJORSEMI[2]-1, Scale.BbMAJORSEMI[4]};
				 isValid = true;
				for(int j=0; j< Bbmajor.length; j++) {
					boolean isFound = false;
					for (int k =0; k < scale.length; k++) {
						if(Bbmajor[j] == scale[k]) {
							isFound = true;
						}
						if (isFound == false && k == scale.length-1) {
							isValid = false;
						}
					}
				}
				if (isValid == true) {
					chordsAllowed.add("Bb");

				}
				break;
			case 11:
				int[] Bmajor = {Scale.BMAJORSEMI[0], Scale.BMAJORSEMI[2]-1, Scale.BMAJORSEMI[4]};
				 isValid = true;
				for(int j=0; j< Bmajor.length; j++) {
					boolean isFound = false;
					for (int k =0; k < scale.length; k++) {
						if(Bmajor[j] == scale[k]) {
							isFound = true;
						}
						if (isFound == false && k == scale.length-1) {
							isValid = false;
						}
					}
				}
				if (isValid == true) {
					chordsAllowed.add("B");

				}
				break;
				
			}	
			
		}
		return chordsAllowed;
	
	}
	public static ArrayList<String> diminished(int[] scale){
ArrayList<String> chordsAllowed = new ArrayList<String>();
		
		for (int i =0; i < scale.length; i++) {
			switch(scale[i]) {
			case 0: 
				
				int[] Cdim = {Scale.CMAJORSEMI[0], Scale.CMAJORSEMI[2]-1, Scale.CMAJORSEMI[4]-1};
				boolean isValid = true;
				for(int j=0; j< Cdim.length; j++) {
					boolean isFound = false;
					for (int k =0; k < scale.length; k++) {
						if(Cdim[j] == scale[k]) {
							isFound = true;
						}
						if (isFound == false && k == scale.length-1) {
							isValid = false;
						}
					}
				}
				if (isValid == true) {
					chordsAllowed.add("C");
				}
				break;
			case 1:
				int[] Dbdim = {Scale.DbMAJORSEMI[0], Scale.DbMAJORSEMI[2]-1, Scale.DbMAJORSEMI[4]-1};
				 isValid = true;
				for(int j=0; j< Dbdim.length; j++) {
					boolean isFound = false;
					for (int k =0; k < scale.length; k++) {
						if(Dbdim[j] == scale[k]) {
							isFound = true;
						}
						if (isFound == false && k == scale.length-1) {
							isValid = false;
						}
					}
				}
				if (isValid == true) {
					chordsAllowed.add("Db");

				}
				break;
			case 2:
				int[] Dmajor = {Scale.DMAJORSEMI[0], Scale.DMAJORSEMI[2]-1, Scale.DMAJORSEMI[4]-1};
				 isValid = true;
				for(int j=0; j< Dmajor.length; j++) {
					boolean isFound = false;
					for (int k =0; k < scale.length; k++) {
						if(Dmajor[j] == scale[k]) {
							isFound = true;
						}
						if (isFound == false && k == scale.length-1) {
							isValid = false;
						}
					}
				}
				if (isValid == true) {
					chordsAllowed.add("D");

				}
				break;
			case 3:
				int[] Ebmajor = {Scale.EbMAJORSEMI[0], Scale.EbMAJORSEMI[2]-1, Scale.EbMAJORSEMI[4]-1};
				 isValid = true;
				for(int j=0; j< Ebmajor.length; j++) {
					boolean isFound = false;
					for (int k =0; k < scale.length; k++) {
						if(Ebmajor[j] == scale[k]) {
							isFound = true;
						}
						if (isFound == false && k == scale.length-1) {
							isValid = false;
						}
					}
				}
				if (isValid == true) {
					chordsAllowed.add("Eb");

				}
				break;
			case 4:
				int[] Emajor = {Scale.EMAJORSEMI[0], Scale.EMAJORSEMI[2]-1, Scale.EMAJORSEMI[4]-1};
				 isValid = true;
				for(int j=0; j< Emajor.length; j++) {
					boolean isFound = false;
					for (int k =0; k < scale.length; k++) {
						if(Emajor[j] == scale[k]) {
							isFound = true;
						}
						if (isFound == false && k == scale.length-1) {
							isValid = false;
						}
					}
				}
				if (isValid == true) {
					chordsAllowed.add("E");

				}
				break;
			case 5:
				int[] Fmajor = {Scale.FMAJORSEMI[0], Scale.FMAJORSEMI[2]-1, Scale.FMAJORSEMI[4]-1};
				 isValid = true;
				for(int j=0; j< Fmajor.length; j++) {
					boolean isFound = false;
					for (int k =0; k < scale.length; k++) {
						if(Fmajor[j] == scale[k]) {
							isFound = true;
						}
						if (isFound == false && k == scale.length-1) {
							isValid = false;
						}
					}
				}
				if (isValid == true) {
					chordsAllowed.add("F");

				}
				break;
			case 6:
				int[] Gbmajor = {Scale.GbMAJORSEMI[0], Scale.GbMAJORSEMI[2]-1, Scale.GbMAJORSEMI[4]-1};
				 isValid = true;
				for(int j=0; j< Gbmajor.length; j++) {
					boolean isFound = false;
					for (int k =0; k < scale.length; k++) {
						if(Gbmajor[j] == scale[k]) {
							isFound = true;
						}
						if (isFound == false && k == scale.length-1) {
							isValid = false;
						}
					}
				}
				if (isValid == true) {
					chordsAllowed.add("F#");

				}
				break;
			case 7:
				int[] Gmajor = {Scale.GMAJORSEMI[0], Scale.GMAJORSEMI[2]-1, Scale.GMAJORSEMI[4]-1};
				 isValid = true;
				for(int j=0; j< Gmajor.length; j++) {
					boolean isFound = false;
					for (int k =0; k < scale.length; k++) {
						if(Gmajor[j] == scale[k]) {
							isFound = true;
						}
						if (isFound == false && k == scale.length-1) {
							isValid = false;
						}
					}
				}
				if (isValid == true) {
					chordsAllowed.add("G");

				}
				break;
			case 8:
				int[] Abmajor = {Scale.AbMAJORSEMI[0], Scale.AbMAJORSEMI[2]-1, Scale.AbMAJORSEMI[4]-1};
				 isValid = true;
				for(int j=0; j< Abmajor.length; j++) {
					boolean isFound = false;
					for (int k =0; k < scale.length; k++) {
						if(Abmajor[j] == scale[k]) {
							isFound = true;
						}
						if (isFound == false && k == scale.length-1) {
							isValid = false;
						}
					}
				}
				if (isValid == true) {
					chordsAllowed.add("Ab");

				}
				break;
			case 9:
				int[] Amajor = {Scale.AMAJORSEMI[0], Scale.AMAJORSEMI[2]-1, Scale.AMAJORSEMI[4]-1};
				 isValid = true;
				for(int j=0; j< Amajor.length; j++) {
					boolean isFound = false;
					for (int k =0; k < scale.length; k++) {
						if(Amajor[j] == scale[k]) {
							isFound = true;
						}
						if (isFound == false && k == scale.length-1) {
							isValid = false;
						}
					}
				}
				if (isValid == true) {
					chordsAllowed.add("A");

				}
				break;
			case 10:
				int[] Bbmajor = {Scale.BbMAJORSEMI[0], Scale.BbMAJORSEMI[2]-1, Scale.BbMAJORSEMI[4]-1};
				 isValid = true;
				for(int j=0; j< Bbmajor.length; j++) {
					boolean isFound = false;
					for (int k =0; k < scale.length; k++) {
						if(Bbmajor[j] == scale[k]) {
							isFound = true;
						}
						if (isFound == false && k == scale.length-1) {
							isValid = false;
						}
					}
				}
				if (isValid == true) {
					chordsAllowed.add("Bb");

				}
				break;
			case 11:
				int[] Bmajor = {Scale.BMAJORSEMI[0], Scale.BMAJORSEMI[2]-1, Scale.BMAJORSEMI[4]-1};
				 isValid = true;
				for(int j=0; j< Bmajor.length; j++) {
					boolean isFound = false;
					for (int k =0; k < scale.length; k++) {
						if(Bmajor[j] == scale[k]) {
							isFound = true;
						}
						if (isFound == false && k == scale.length-1) {
							isValid = false;
						}
					}
				}
				if (isValid == true) {
					chordsAllowed.add("B");

				}
				break;
				
			}	
			
		}
		return chordsAllowed;
		
	}
	public static ArrayList<String> augmented(int[] scale){
ArrayList<String> chordsAllowed = new ArrayList<String>();
		
		for (int i =0; i < scale.length; i++) {
			switch(scale[i]) {
			case 0: 
				
				int[] Cdim = {Scale.CMAJORSEMI[0], Scale.CMAJORSEMI[2], Scale.CMAJORSEMI[4]+1};
				boolean isValid = true;
				for(int j=0; j< Cdim.length; j++) {
					boolean isFound = false;
					for (int k =0; k < scale.length; k++) {
						if(Cdim[j] == scale[k]) {
							isFound = true;
						}
						if (isFound == false && k == scale.length-1) {
							isValid = false;
						}
					}
				}
				if (isValid == true) {
					chordsAllowed.add("C");
				}
				break;
			case 1:
				int[] Dbdim = {Scale.DbMAJORSEMI[0], Scale.DbMAJORSEMI[2], Scale.DbMAJORSEMI[4]+1};
				 isValid = true;
				for(int j=0; j< Dbdim.length; j++) {
					boolean isFound = false;
					for (int k =0; k < scale.length; k++) {
						if(Dbdim[j] == scale[k]) {
							isFound = true;
						}
						if (isFound == false && k == scale.length-1) {
							isValid = false;
						}
					}
				}
				if (isValid == true) {
					chordsAllowed.add("Db");

				}
				break;
			case 2:
				int[] Dmajor = {Scale.DMAJORSEMI[0], Scale.DMAJORSEMI[2], Scale.DMAJORSEMI[4]+1};
				 isValid = true;
				for(int j=0; j< Dmajor.length; j++) {
					boolean isFound = false;
					for (int k =0; k < scale.length; k++) {
						if(Dmajor[j] == scale[k]) {
							isFound = true;
						}
						if (isFound == false && k == scale.length-1) {
							isValid = false;
						}
					}
				}
				if (isValid == true) {
					chordsAllowed.add("D");

				}
				break;
			case 3:
				int[] Ebmajor = {Scale.EbMAJORSEMI[0], Scale.EbMAJORSEMI[2], Scale.EbMAJORSEMI[4]+1};
				 isValid = true;
				for(int j=0; j< Ebmajor.length; j++) {
					boolean isFound = false;
					for (int k =0; k < scale.length; k++) {
						if(Ebmajor[j] == scale[k]) {
							isFound = true;
						}
						if (isFound == false && k == scale.length-1) {
							isValid = false;
						}
					}
				}
				if (isValid == true) {
					chordsAllowed.add("Eb");

				}
				break;
			case 4:
				int[] Emajor = {Scale.EMAJORSEMI[0], Scale.EMAJORSEMI[2], Scale.EMAJORSEMI[4]+1};
				 isValid = true;
				for(int j=0; j< Emajor.length; j++) {
					boolean isFound = false;
					for (int k =0; k < scale.length; k++) {
						if(Emajor[j] == scale[k]) {
							isFound = true;
						}
						if (isFound == false && k == scale.length-1) {
							isValid = false;
						}
					}
				}
				if (isValid == true) {
					chordsAllowed.add("E");

				}
				break;
			case 5:
				int[] Fmajor = {Scale.FMAJORSEMI[0], Scale.FMAJORSEMI[2], Scale.FMAJORSEMI[4]+1};
				 isValid = true;
				for(int j=0; j< Fmajor.length; j++) {
					boolean isFound = false;
					for (int k =0; k < scale.length; k++) {
						if(Fmajor[j] == scale[k]) {
							isFound = true;
						}
						if (isFound == false && k == scale.length-1) {
							isValid = false;
						}
					}
				}
				if (isValid == true) {
					chordsAllowed.add("F");

				}
				break;
			case 6:
				int[] Gbmajor = {Scale.GbMAJORSEMI[0], Scale.GbMAJORSEMI[2], Scale.GbMAJORSEMI[4]+1};
				 isValid = true;
				for(int j=0; j< Gbmajor.length; j++) {
					boolean isFound = false;
					for (int k =0; k < scale.length; k++) {
						if(Gbmajor[j] == scale[k]) {
							isFound = true;
						}
						if (isFound == false && k == scale.length-1) {
							isValid = false;
						}
					}
				}
				if (isValid == true) {
					chordsAllowed.add("F#");

				}
				break;
			case 7:
				int[] Gmajor = {Scale.GMAJORSEMI[0], Scale.GMAJORSEMI[2], Scale.GMAJORSEMI[4]+1};
				 isValid = true;
				for(int j=0; j< Gmajor.length; j++) {
					boolean isFound = false;
					for (int k =0; k < scale.length; k++) {
						if(Gmajor[j] == scale[k]) {
							isFound = true;
						}
						if (isFound == false && k == scale.length-1) {
							isValid = false;
						}
					}
				}
				if (isValid == true) {
					chordsAllowed.add("G");

				}
				break;
			case 8:
				int[] Abmajor = {Scale.AbMAJORSEMI[0], Scale.AbMAJORSEMI[2], Scale.AbMAJORSEMI[4]+1};
				 isValid = true;
				for(int j=0; j< Abmajor.length; j++) {
					boolean isFound = false;
					for (int k =0; k < scale.length; k++) {
						if(Abmajor[j] == scale[k]) {
							isFound = true;
						}
						if (isFound == false && k == scale.length-1) {
							isValid = false;
						}
					}
				}
				if (isValid == true) {
					chordsAllowed.add("Ab");

				}
				break;
			case 9:
				int[] Amajor = {Scale.AMAJORSEMI[0], Scale.AMAJORSEMI[2], Scale.AMAJORSEMI[4]+1};
				 isValid = true;
				for(int j=0; j< Amajor.length; j++) {
					boolean isFound = false;
					for (int k =0; k < scale.length; k++) {
						if(Amajor[j] == scale[k]) {
							isFound = true;
						}
						if (isFound == false && k == scale.length-1) {
							isValid = false;
						}
					}
				}
				if (isValid == true) {
					chordsAllowed.add("A");

				}
				break;
			case 10:
				int[] Bbmajor = {Scale.BbMAJORSEMI[0], Scale.BbMAJORSEMI[2], Scale.BbMAJORSEMI[4]+1};
				 isValid = true;
				for(int j=0; j< Bbmajor.length; j++) {
					boolean isFound = false;
					for (int k =0; k < scale.length; k++) {
						if(Bbmajor[j] == scale[k]) {
							isFound = true;
						}
						if (isFound == false && k == scale.length-1) {
							isValid = false;
						}
					}
				}
				if (isValid == true) {
					chordsAllowed.add("Bb");

				}
				break;
			case 11:
				int[] Bmajor = {Scale.BMAJORSEMI[0], Scale.BMAJORSEMI[2], Scale.BMAJORSEMI[4]+1};
				 isValid = true;
				for(int j=0; j< Bmajor.length; j++) {
					boolean isFound = false;
					for (int k =0; k < scale.length; k++) {
						if(Bmajor[j] == scale[k]) {
							isFound = true;
						}
						if (isFound == false && k == scale.length-1) {
							isValid = false;
						}
					}
				}
				if (isValid == true) {
					chordsAllowed.add("B");

				}
				break;
				
			}	
			
		}
		return chordsAllowed;
		
	}
	public static void dominant(){
		
	}

}
