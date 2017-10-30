
package monopoly;

import java.util.Scanner;

/**
 *
 * @author erso
 */
public interface FieldInterface
{
    // Disse metoder er underforstået 'public abstract static': 
    String getName();
    int getNumber();
    void consequense(Player poorPlayer);
    
}
