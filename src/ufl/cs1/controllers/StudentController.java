package ufl.cs1.controllers;

import game.controllers.DefenderController;
import game.models.Defender;
import game.models.Game;

import java.util.List;

public final class StudentController implements DefenderController
{
	public void init(Game game) { }

	public void shutdown(Game game) { }

	public int[] update(Game game,long timeDue)
	{
		int[] actions = new int[Game.NUM_DEFENDER];
		List<Defender> enemies = game.getDefenders();
		
		/*//Chooses a random LEGAL action if required. Could be much simpler by simply returning
		//any random number of all of the ghosts
		for(int i = 0; i < actions.length; i++)
		{
			Defender defender = enemies.get(i);
			List<Integer> possibleDirs = defender.getPossibleDirs();
			if (possibleDirs.size() != 0)
				actions[i]=possibleDirs.get(Game.rng.nextInt(possibleDirs.size()));
			else
				actions[i] = -1;
		}*/
		actions[0] = doctorPepper(game, timeDue);
		return actions;
	}
	public int doctorPepper(Game doe, long timer) {
		int hououin = 0;
		List<Defender> enemies = doe.getDefenders();
		Defender defender = enemies.get(0);
		Attacker Megan = doe.getAttacker();  //Changed name to Megan because Kassandra isn't mean to me, but Megan would be. (Drake and Josh reference)
		//List<Node> joe = doe.getPillList();
		//Node earl; //FIXME Need to initialize???

		if (defender.isVulnerable()) {
				//ListNode
				Node bob = Megan.getLocation();
				hououin = defender.getNextDir(bob, false);
			//Get away from the yellow muncher.

		}
		else {
			//Chase the yellow muncher.
			Node bob = Megan.getLocation();
			//hououin = earl.getPathDistance(bob); //FIXME GET NEXT DIRECTION WOULD BE BETTER.
			hououin = defender.getNextDir(bob, true);
		}

		return hououin;
}
