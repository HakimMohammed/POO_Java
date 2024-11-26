package views.components;

import javafx.scene.control.Button;
import javafx.scene.control.TableCell;
import javafx.scene.layout.HBox;

public class ActionCell<T> extends TableCell<T, Integer> {

    private final Button deleteButton;
    private final Button editButton;
    private final Button assignButton;
    private final HBox buttonBox;

    public ActionCell() {
        // Initialize buttons
        deleteButton = new Button("Delete");
        deleteButton.setStyle("-fx-background-color: red; -fx-text-fill: white;");

        editButton = new Button("Edit");
        editButton.setStyle("-fx-background-color: orange; -fx-text-fill: white;");

        assignButton = new Button("Assign to Dept");
        assignButton.setStyle("-fx-background-color: green; -fx-text-fill: white;");

        // Add button actions
        deleteButton.setOnAction(e -> handleDelete(getTableRow().getItem()));
        editButton.setOnAction(e -> handleEdit(getTableRow().getItem()));
        assignButton.setOnAction(e -> handleAssign(getTableRow().getItem()));

        // Add buttons to an HBox
        buttonBox = new HBox(10, deleteButton, editButton, assignButton);
    }

    @Override
    protected void updateItem(Integer item, boolean empty) {
        super.updateItem(item, empty);

        if (empty) {
            setGraphic(null);
        } else {
            // Set the button container as the graphic for the cell
            setGraphic(buttonBox);
        }
    }

    // Handle the delete action
    private void handleDelete(T item) {
        System.out.println("Deleting item: " + item);
        // Add logic for deleting the item (Professor, Department, etc.)
    }

    // Handle the edit action
    private void handleEdit(T item) {
        System.out.println("Editing item: " + item);
        // Add logic for editing the item (Professor, Department, etc.)
    }

    // Handle the assign action
    private void handleAssign(T item) {
        System.out.println("Assigning item: " + item);
        // Add logic for assigning the item to something (e.g., a department)
    }
}

