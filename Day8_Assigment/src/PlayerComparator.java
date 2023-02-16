import java.util.Comparator;

public class PlayerComparator implements Comparator<Player>{

	@Override
	public int compare(Player o1, Player o2) {
		// TODO Auto-generated method stub
		  // Comparing customers
        int NameCompare = o1.getName().compareTo(
            o2.getName());

        int SkillCompare = o1.getSkill().compareTo(o2.getSkill());
		// 2nd level comparison
	    return (NameCompare == 0) ? SkillCompare: NameCompare;
	}

}
