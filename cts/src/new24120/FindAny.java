package new24120;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;


public class FindAny {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=Arrays.asList(11,13,45,69,79);
		Stream s=Stream.of(11,13,45,69,79);
		Optional<Integer> ans=list.stream().findAny();
		if(ans.isPresent())
		{
			System.out.println(ans.get());
		}
		else
			{
				System.out.println("no number");
		}
		
		

	}

}
