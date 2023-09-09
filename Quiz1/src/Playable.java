public interface Playable <D, A>
{
	public abstract D whatToPlayOn();
	public abstract void howToPlay(D t); 
	public default void getAgeGroup(A a)
	{
		System.out.println("Appropriate for the age of " + a);
	}
}
