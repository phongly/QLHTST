
package phieunhaphang;
import phieunhaphang.DateLabelFormatter;
import java.util.Locale;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import net.sourceforge.jdatepicker.impl.JDatePanelImpl;
import net.sourceforge.jdatepicker.impl.JDatePickerImpl;
import net.sourceforge.jdatepicker.impl.UtilDateModel;
public class jDatePickerPanel extends JPanel{

    public jDatePickerPanel() {
        UtilDateModel model = new UtilDateModel();
        JDatePanelImpl datePanel = new JDatePanelImpl(model);
        JDatePickerImpl datePicker = new JDatePickerImpl(datePanel, new DateLabelFormatter());
        add(datePicker);
        setSize(400, 300);
        
    }

    public static void main(String args[]) {
        
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                //To change body of generated methods, choose Tools | Templates.
                new jDatePickerPanel().setVisible(true);
            }
        });
    }
}
