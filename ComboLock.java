/*Declare a class ComboLock that works like the combination lock
in a gym locker, as shown here. The lock is constructed with a
combina­tion—three numbers between 0 and 39. The reset method
resets the dial so that it points to 0. The turnLeft and turnRight
methods turn the dial by a given number of ticks to the left or
right. The open method attempts to open the lock. The lock opens
if the user first turned it right to the first number in the combination, 
then left to the second, and then right to the third.
*/

public class ComboLock {
    private int secret1;
    private int secret2;
    private int secret3;
    private int dial;
    private boolean unlock;

    public ComboLock(int secret1, int secret2, int secret3) {
        this.secret1 = secret1;
        this.secret2 = secret2;
        this.secret3 = secret3;
        this.unlock = false;
    }

    public int reset() {
        this.dial = 0;
        return 0;
    }

    public boolean turnLeft(int ticks) {
        this.scroll(-ticks);
        if (this.secret1 == -1) {
            if (this.shouldUnlock(secret2) == true) {
            	this.unlock = true;
            }
        }
        else
        {
        	return unlock;
        }
        return unlock;
    }

    public boolean turnRight(int ticks) {
        this.scroll(ticks);
        if (this.shouldUnlock(secret1) == true) {
        	this.unlock = true;
            if (this.shouldUnlock(secret2) == true) {
            	this.unlock = true;
                if (this.shouldUnlock(secret3) == true) {
                	this.unlock = true;
                }
            }
        }
        else
        {
        	return unlock;
        }
        return unlock;
    }

    public int scroll(int ticks) {
        if (this.dial + ticks > 39) {
            if (ticks >= 39) {
                this.dial += ticks - 39;
            } else if (this.dial >= 39) {
            }
        } else if (this.dial + ticks < 0) {
            this.dial += 40 + ticks;
        } else {
            this.dial += ticks;
        }
        return dial;
    }

    public boolean shouldUnlock(int secret) {
        if (this.dial == secret) {
            return true;
        } else {
            return false;
        }
    }
    
    public void setSecret1() {
    	this.secret1 = secret1;
    }
    
    public int getSecret1() {
    	return secret1;
    }
    
    public void setSecret2() {
    	this.secret2 = secret2;
    }
    public int getSecret2() {
    	return secret2;
    }
    
    public void setSecret3() {
    	this.secret3 = secret3;
    }
    public int getSecret3() {
    	return secret3;
    }
}
