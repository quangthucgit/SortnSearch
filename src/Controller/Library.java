package Controller;

import View.Menu;

public class Library extends Menu {
    private ManageSort mso;
    private ManageSearch mse;

    public Library() {
        super("Sort and Search System", new String[]{"Sort", "Search", "Exit"});
        mso = new ManageSort();
        mse = new ManageSearch();
    }

    @Override
    public void execute(int choice) {
        switch (choice) {
            case 1:
                mso.run();
                break;
            case 2:
                mse.run();
                break;
            case 3:
                System.out.println("Exited.");
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                break;
        }
    }
}
