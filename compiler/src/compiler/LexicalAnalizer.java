package compiler;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.EnumMap;
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
		{@Override
			public boolean isAccepting()
			{
			return false;
			}
		},
		assignmentOpp,
		seperator, 
		delimiter,
		whiteSpace,
		commentOpen{@Override
			public boolean isAccepting()
			{
			return false;
			}
		},
		commentClose,
		stringOpen		
		{@Override
			public boolean isAccepting()
			{
			return false;
			}
		},
		stringClose,
		invalidWord
		;
		public boolean isAccepting()
		{
			return true;
		}
	}
	
	public static void main(String[] args)
	{
		FileReader reader = new FileReader(file);
		Map<STATE,Map<Character,STATE>> stateTable = new EnumMap<STATE,Map<Character,STATE>>(STATE.class);
		Map<String,ArrayList<String>> symbolTable = new Map<String,ArrayList<String>>()-+++;
		while(ready)
		{
			
		}
		
	}
	
	public void tokenize(String fileName)
	{
		STATE current = STATE.start;
		
	}
}
