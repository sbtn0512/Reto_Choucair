package co.com.choucair.certification.questions;

import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.time.LocalDateTime;
import java.util.List;

import static co.com.choucair.certification.userinterfaces.OrderPage.ROW;
import static co.com.choucair.certification.utils.Constants.CREATED_ORDER;

public class GetData implements Question<Boolean> {

    public static GetData confirmationOrder() {
        return new GetData();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        LocalDateTime datetime = LocalDateTime.now();
        String requiredDate,orderDate;
        if(datetime.getDayOfMonth() >=10)
            orderDate = datetime.getDayOfMonth() + "/" + datetime.getMonthValue() + "/" + datetime.getYear();
        else
            orderDate = "0"+datetime.getDayOfMonth() + "/" + datetime.getMonthValue() + "/" + datetime.getYear();
        if(datetime.getDayOfMonth() < 25) {
            if (datetime.getDayOfMonth() >= 7)
                requiredDate = datetime.getDayOfMonth() + 3 + "/" + datetime.getMonthValue() + "/" + datetime.getYear();
            else
                requiredDate = "0" + (datetime.getDayOfMonth() + 3) + "/" + datetime.getMonthValue() + "/" + datetime.getYear();
        }else
            requiredDate =  "06/" + datetime.getMonthValue() + "/" + datetime.getYear();
        DataTable dataOrder = actor.recall(CREATED_ORDER);
        String dataView = Text.of(ROW).viewedBy(actor).asString();
        String dataOrderOrganized = dataView.substring(0,5) + "\n" +
                dataOrder.cell(1,0)+"\n"+
                orderDate + "\n"+
                dataOrder.cell(1,1)+"\n"+
                requiredDate + "\n"+
                requiredDate + "\n"+
                dataOrder.cell(1,3)+"\n"+
                dataOrder.cell(1,9)+"\n"+
                dataOrder.cell(1,7)+"\n"+
                dataOrder.cell(1,4);
        return dataOrderOrganized.equals(dataView);
    }
}
