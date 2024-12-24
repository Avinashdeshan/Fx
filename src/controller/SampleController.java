package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.cell.PropertyValueFactory;
import model.Item;

import java.util.ArrayList;

public class SampleController {
    public TextArea txtId;
    public TextArea txtName;
    public TextArea txtQty;
    public TextArea txtPrice;
    public TextArea txtDes;
    public TableView tblItems;
    public TableColumn colId;
    public TableColumn colName;
    public TableColumn colQty;
    public TableColumn colPrice;
    public TableColumn colDes;

    ArrayList<Item> itemArrayList=new ArrayList<>();

    public void btnAddItemOnAction(ActionEvent actionEvent) {
        String id=txtId.getText();
        String name=txtName.getText();
        int qty= Integer.parseInt(txtQty.getText());
        double price= Double.parseDouble(txtPrice.getText());
        String dis=txtDes.getText();

        Item item=new Item(id,name,qty,price,dis);
        itemArrayList.add(item);
        loadTable();

        System.out.println("...........................................");
        itemArrayList.forEach(itemObj->{
            System.out.println(itemObj);
        });
        System.out.println("...........................................");
    }
    private void loadTable(){
        colId.setCellValueFactory(new PropertyValueFactory<>("id"));
        colName.setCellValueFactory(new PropertyValueFactory<>("name"));
        colQty.setCellValueFactory(new PropertyValueFactory<>("qty"));
        colPrice.setCellValueFactory(new PropertyValueFactory<>("price"));
        colDes.setCellValueFactory(new PropertyValueFactory<>("dis"));

        ObservableList<Item> itemObservableList= FXCollections.observableArrayList(itemArrayList);
        tblItems.setItems(itemObservableList);
    }
    public void btnRemoveItemOnAction(ActionEvent actionEvent) {
        Item selectedItem = (Item) tblItems.getSelectionModel().getSelectedItem();

        if (selectedItem != null) {
            itemArrayList.remove(selectedItem);
            loadTable();
            System.out.println("Removed item: " + selectedItem);
        } else {
            System.out.println("No item selected for removal.");
        }
    }
}
