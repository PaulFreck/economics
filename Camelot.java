public class Camelot implements Village, Selectable
{
    public String[] resources = {"iron", "berries"};
    private int pop = 100;
    public void IncrementPop()
    {
        pop += 1;
    }
    public void getResources()
    {
        System.out.println(resources);
    }
    public void getPop()
    {
        System.out.println(pop);
    }
    public String selectedOutput()
    {
        return "select one to see the pop, select two to see resources";
    }
    public String selectOne()
    {
        return Integer.toString(pop);
    }
    public String selectTwo()
    {
        System.out.println(resources[0]);
        return "";
    }
    public String selectThree()
    {
        return "no such output for this selection";
    }
}
