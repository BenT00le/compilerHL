package compiler;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

public class LexicalAnalizer 
{
	enum STATE
	{
		start
		{@Override
			public boolean isAccepting()
			{
			return false;
			}
		},
		digit,
		letter,
		relationalOperator,
		number,
		identifier,
		addOpp,
		subOpp,
		multOpp,
		divOpp,
		preassignmentOpp
		{
			@Override
			public boolean isAccepting()
			{
			return false;
			}
		},
		assignmentOpp,
		seperator, 
		delimiter,
		whiteSpace,
		commentOpen
		{
			@Override
			public boolean isAccepting()
			{
			return false;
			}
		},
		commentClose,
		stringOpen		
		{
			@Override
			public boolean isAccepting()
			{
			return false;
			}
		},
		stringClose,
		invalidWord;
		
		public boolean isAccepting()
		{
			return true;
		}
	}
	
	static Map<STATE, HashMap<Character, STATE>> stateTable = new EnumMap<STATE,HashMap<Character,STATE>>(STATE.class);
	Map<String,ArrayList<String>> symbolTable = new HashMap<String,ArrayList<String>>();
	
	public static void main(String[] args)
	{
		//populate state table
		char[] alphabet = {'a','0','<','>','=','"','_','-','+','/','*',' ',':','(',')','{','}',';'};
		for(STATE state : STATE.values())
		{
			for(int c = 0; c < alphabet.length; c++)
			{
				if(state.equals(STATE.start))
				{
					switch (c) 
					{
						case 0:
							stateTable.put(state,new HashMap<Character,STATE>());
							break;
						case 1:
							
							break;
						case 2:
							
							break;
						case 3:
							
							break;
						case 4:
							
							break;
						case 5:
							
							break;
						case 6:
							
							break;
						case 7:
							
							break;
						case 8:
							
							break;
						case 9:
							
							break;
						case 10:
							
							break;
						case 11:
							
							break;
						case 12:
							
							break;
						case 13:
							
							break;
						case 14:
							
							break;
						case 15:
							
							break;
						case 16:
							
							break;
						case 17:
							
							break;
						default:
							break;
					}
				}
			}
		}
	}
	
	public void tokenize(String fileName)
	{
		STATE current = STATE.start;
		try 
		{
			FileReader reader = new FileReader(fileName);
			while(reader.ready())
			{
				
			}
			reader.close();
		} 
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
