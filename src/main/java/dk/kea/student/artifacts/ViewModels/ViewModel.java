package dk.kea.student.artifacts.ViewModels;

import dk.kea.student.artifacts.ViewModels.Entities.MainViewModel;

public class ViewModel
{
    private MainViewModel mainModel;

    public ViewModel()
    {
        mainModel = new MainViewModel();
    }

    public MainViewModel getMainModel()
    {
        return mainModel;
    }

    public void setMainModel(MainViewModel mainModel)
    {
        this.mainModel = mainModel;
    }
}
