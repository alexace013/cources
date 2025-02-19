package session23;

import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * Created with IntelliJ IDEA.
 * User: al1
 * Date: 22.05.15
 */
public class Tree extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws FileNotFoundException {
        primaryStage.setTitle("Tree View Sample");
        Node rootIcon = new ImageView(new Image(new FileInputStream("folder2.png")));
        TreeItem<String> rootItem = new TreeItem<> ("Inbox", rootIcon);
        rootItem.setExpanded(true);
        for (int i = 1; i < 6; i++) {
            TreeItem<String> item = new TreeItem<>("Message" + i);
            rootItem.getChildren().add(item);
        }
        TreeView<String> tree = new TreeView<>(rootItem);
/*        BorderPane root = new BorderPane();
        Button closeBtn = new Button("Close");
        closeBtn.setOnMouseClicked(mouseEvent -> {
            root.setCenter(tree);
//            primaryStage.hide();
        });
        root.setTop(closeBtn);*/

        primaryStage.setScene(new Scene(tree, 300, 250));
        primaryStage.show();
    }
}
