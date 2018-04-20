package dk.kea.student.artifacts.ViewModels.Entities;

public class MainViewModel
{
    private int studentID;
    private boolean isAccepted, accept = false, isError = false;
    private String errorMessage;

    public MainViewModel()
    {
        this.isAccepted = false;
    }

    public int getStudentID()
    {
        return studentID;
    }

    public void setStudentID(int studentID)
    {
        this.studentID = studentID;
    }

    public boolean isAccepted()
    {
        return isAccepted;
    }

    public void setAccepted(boolean accepted)
    {
        isAccepted = accepted;
    }
}
