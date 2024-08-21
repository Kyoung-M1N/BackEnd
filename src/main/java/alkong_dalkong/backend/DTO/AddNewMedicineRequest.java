package alkong_dalkong.backend.DTO;

import lombok.Data;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Data
public class AddNewMedicineRequest {
    private String medicineName;
    private List<DayOfWeek> medicineWeek = new ArrayList<>();
    private Integer medicineTimes;
    private List<LocalTime> medicineTakenTime = new ArrayList<>();
    private LocalDate medicineStart;
    private LocalDate medicineEnd;
    private Long medicineDosage;
    private Integer medicineTakenType;
    private String medicineMemo;
    private Integer medicineAlarm;
}
