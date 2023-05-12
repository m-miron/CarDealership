
/**
 * MenuInterface is a superclass (base class) that can be used
 * to develop menu-driven user interfaces that run on ANSI
 * standard terminals and emulators such as XTerm, MinTerm,
 * etc.
 *
 * The general appearance of a CLI menu is divided
 * into four sections:
 *
 *    heading     - A Heading, that introduces the menu.
 *    menu        - A list of options, identified by numbers or letters.
 *    status      - A status line that can be used to report input errors.
 *    menu_prompt - That asks the user for the appropriate inputThis class is not strongly encapsulated.
 *
 * Subclasses are granted access to the following
 * protected variables to make coding simple.
 *
 *   String heading
 *   String menu
 *   String menu_prompt
 *   String status
 *   Scanner inputScanner
 *
 *   This superclass is not really very versatile.  It is specific to
 *   the dealership app and expects to work with
 *   the following domain classes:
 *
 *   Vehicle    -   it will hold information about a specific vehicle.
 *   Dealership -   it will hold information about the dealership and maintain a list of vehicles with methods to search
 *                  for matching vehicles as well as add/remove vehicles.
 *   DealershipFileManage - it will read the dealership csv file, parse, and create a Dealership object full of vehicles
 *                          the file. I will also save a dealership and the vehicles back into the file with the pipe-delimited format.
 *
 *
 * A subclass must provide its own constructor, and
 * must @Override the following methods:
 *
 *   doInputUntilDone()
 *
 */
public class MenuInterface {


}
