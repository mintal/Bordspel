package controller.title;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by mintal on 26/05/2017.
 */
public class HostController implements Initializable {

    @FXML private TextArea difficultyDescription;

    public void initialize(URL location, ResourceBundle resources) {
        difficultyDescription.setText(
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec dolor sem, vestibulum eu vehicula eu, semper quis odio. Nullam dapibus, turpis non lobortis ultrices, lorem neque egestas odio, sit amet pretium lorem lorem eget tellus. In non semper est. Sed vel mauris in nisl sodales tristique quis in leo. Duis gravida tellus vitae quam efficitur, et egestas tellus vulputate. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Nullam facilisis consequat sem nec mattis. Curabitur eleifend suscipit mi, id gravida mi mollis a. Vestibulum volutpat tellus at eros malesuada, eu convallis dolor dignissim. Quisque rutrum est in mi sagittis consectetur. Aliquam ac ante massa. Donec vel magna quis lectus dictum consequat. Etiam non porttitor nulla, id semper nisi. Nulla scelerisque diam sed dignissim venenatis. Maecenas lacinia odio id imperdiet mollis.\n" +
                "\n" +
                "Morbi a purus nec nunc sollicitudin volutpat et et sapien. Proin ut est pellentesque, laoreet dui vel, pellentesque mi. Praesent feugiat maximus leo quis volutpat. Proin turpis nulla, iaculis ut mattis et, cursus nec dui. Nulla a sapien vel turpis cursus sagittis non non felis. Cras quis nulla quis leo aliquet volutpat a vitae tellus. Ut tristique eros vitae tincidunt posuere. Praesent auctor ante sit amet diam vestibulum scelerisque. Maecenas porttitor porttitor orci vel molestie. Nulla ultrices nisi id arcu vestibulum tempor.\n" +
                "\n" +
                "Vestibulum ultrices sit amet est ut maximus. Curabitur vitae nisl ac neque pretium posuere et ac mauris. Donec a finibus nibh. Nulla vel suscipit libero. Donec gravida ligula nibh, in pulvinar dui condimentum vitae. Maecenas ultrices rutrum arcu, vitae sagittis metus tristique vitae. Aliquam in sodales ante, sit amet hendrerit mauris. Maecenas in condimentum enim. Suspendisse potenti. In rutrum et lectus ac posuere. Curabitur malesuada libero nunc, eget laoreet ante imperdiet nec. Duis accumsan ex dui, vel rhoncus ligula mollis in. Ut luctus nisi eget semper fringilla. Vestibulum dapibus consectetur varius. Interdum et malesuada fames ac ante ipsum primis in faucibus.\n" +
                "\n" +
                "Duis nulla nisl, mollis nec dui condimentum, venenatis posuere dolor. Mauris tempus rhoncus faucibus. Nam sed sem non libero accumsan finibus ut eu purus. Duis non nisl at sapien aliquam finibus vel in enim. Sed vulputate lobortis ex, non faucibus erat tincidunt nec. Aliquam rhoncus leo ut gravida ullamcorper. Vestibulum eu nunc nunc. Mauris blandit efficitur scelerisque. Quisque libero lacus, gravida non ipsum et, maximus porttitor erat. Ut consectetur purus ut ipsum dapibus accumsan. Quisque suscipit nec metus vitae varius. Mauris elit odio, pellentesque id arcu ut, malesuada vulputate neque. Nullam eu dignissim nibh, non mollis sem.\n" +
                "\n" +
                "Suspendisse lobortis volutpat lorem, et cursus turpis porttitor ut. Duis tellus erat, viverra at suscipit quis, convallis eget neque. Nulla ac rutrum velit. Sed blandit ullamcorper aliquam. Sed non blandit ante, ac finibus magna. Quisque finibus nec metus at sollicitudin. Donec metus risus, blandit quis ligula nec, aliquam fringilla turpis. ");
    }

}
