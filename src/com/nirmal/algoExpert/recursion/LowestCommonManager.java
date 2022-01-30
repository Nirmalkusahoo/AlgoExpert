package com.nirmal.algoExpert.recursion;

import java.util.ArrayList;
import java.util.List;

public class LowestCommonManager {
    public static OrgChart getLowestCommonManager(
            OrgChart topManager, OrgChart reportOne, OrgChart reportTwo) {
        // Write your code here.
        return getOrgInfo(topManager, reportOne, reportTwo).lowestCommonManager; // Replace this line.
    }

    public static OrgInfo getOrgInfo(OrgChart manager, OrgChart reportOne, OrgChart reportTwo) {
        int numOfDirectReports = 0;

        for (OrgChart org : manager.directReports) {
            OrgInfo orgInfo = getOrgInfo(org, reportOne, reportTwo);

            if (orgInfo.lowestCommonManager != null) {
                return orgInfo;
            }
            numOfDirectReports = numOfDirectReports + orgInfo.numOfImportantReports;
        }

        if (manager.name == reportOne.name || manager.name == reportTwo.name) {
            numOfDirectReports++;
        }
        OrgChart lowestCommonManager;
        if (numOfDirectReports == 2) {

            lowestCommonManager = manager;
        } else {
            lowestCommonManager = null;
        }

        OrgInfo orgInfo = new OrgInfo(lowestCommonManager, numOfDirectReports);
        return orgInfo;
    }

    static class OrgChart {
        public char name;
        public List<OrgChart> directReports;

        OrgChart(char name) {
            this.name = name;
            this.directReports = new ArrayList<OrgChart>();
        }

        // This method is for testing only.
        public void addDirectReports(OrgChart[] directReports) {
            for (OrgChart directReport : directReports) {
                this.directReports.add(directReport);
            }
        }
    }

    public static class OrgInfo {
        OrgChart lowestCommonManager;
        int numOfImportantReports;

        OrgInfo(OrgChart orgChart, int numOfImportantReports) {
            this.lowestCommonManager = orgChart;
            this.numOfImportantReports = numOfImportantReports;
        }
    }

}
