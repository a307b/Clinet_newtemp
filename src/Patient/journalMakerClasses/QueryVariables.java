package Patient.journalMakerClasses;
/* Contains input received from the queury. To generate an PDF, strings needs to be converted to Text objects, so
*  to prevent awkward variable-naming QueryVariables is an class in itself */

public class QueryVariables {
    private String patientName;
    private String CPR;
    private String printDate;
    // T = treatment
    private String startTDate;
    private String endTDate;
    private String dateWritten;
    private String noteType;
    private String examinationDetails;
    private String diagnose;
    private String interpretedBy;
    private String writtenBy;
    private String authenticatedBy;
    private String hospitalName;
    private String departmentName;
    private String uploadedBy;

    public QueryVariables(String patientName, String CPR, String printDate, String startTDate, String endTDate,
                          String dateWritten, String noteType, String examinationDetails, String diagnose, String interpretedBy,
                          String writtenBy, String authenticatedBy, String hospitalName, String departmentName, String uploadedBy) {
        this.patientName = patientName;
        this.CPR = CPR;
        this.printDate = printDate;
        this.startTDate = startTDate;
        this.endTDate = endTDate;
        this.dateWritten = dateWritten;
        this.noteType = noteType;
        this.examinationDetails = examinationDetails;
        this.diagnose = diagnose;
        this.interpretedBy = interpretedBy;
        this.writtenBy = writtenBy;
        this.authenticatedBy = authenticatedBy;
        this.hospitalName = hospitalName;
        this.departmentName = departmentName;
        this.uploadedBy = uploadedBy;
    }

    public String getPatientName() {
        return patientName;
    }

    public String getCPR() {
        return CPR;
    }

    public String getPrintDate() {
        return printDate;
    }

    public String getStartTDate() {
        return startTDate;
    }

    public String getEndTDate() {
        return endTDate;
    }

    public String getDateWritten() {
        return dateWritten;
    }

    public String getNoteType() {
        return noteType;
    }

    public String getExaminationDetails() {
        return examinationDetails;
    }

    public String getDiagnose() {
        return diagnose;
    }

    public String getInterpretedBy() {
        return interpretedBy;
    }

    public String getWrittenBy() {
        return writtenBy;
    }

    public String getAuthenticatedBy() {
        return authenticatedBy;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public String getUploadedBy() {
        return uploadedBy;
    }
}