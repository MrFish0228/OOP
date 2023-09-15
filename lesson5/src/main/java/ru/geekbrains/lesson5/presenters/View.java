package ru.geekbrains.lesson5.presenters;

import ru.geekbrains.lesson5.models.Table;

import java.util.Date;
import java.util.Collection;

public interface View {

    void setObserver(ViewObserver observer);

    void showTables(Collection<Table> tables);

    void showReservationResult(int reservationNo);

    void changeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name);

    void showchangeReservationTable(int oldReservation, int reservationId);

}
