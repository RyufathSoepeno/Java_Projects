//-----------------------------------------------------------------
// Flips this coin by randomly choosing a face value.
//-----------------------------------------------------------------
public void flip ()
{
face = (int) (Math.random() * 2);
}
//-----------------------------------------------------------------
// Returns true if the current face of this coin is heads.
//-----------------------------------------------------------------
public boolean isHeads ()
{
return (face == HEADS);
}
//-----------------------------------------------------------------
// Returns the current face of this coin as a string.
//-----------------------------------------------------------------
public String toString()
{
return (face == HEADS) ? "Heads" : "Tails";
}
}
