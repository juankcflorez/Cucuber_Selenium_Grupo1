const report = require('multiple-cucumber-html-reporter');

report.generate({
    jsonDir: './Reportes/Test/',
    reportPath: './Reportes/Test/',
    openReportInBrowser: true,


    metadata:{
        browser: {
            name: 'Chrome',
            version: '62.3.4'
        },
        device: 'Local test machine',
        platform: {
            name: 'Windows',
            version: '10.34'
        }
    },
    customData: {
        title: 'Run info',
        data: [
            {label: 'Project', value: 'Custom project'},
            {label: 'Release', value: '1.2.3'},
            {label: 'Cycle', value: 'B11221.34321'},
            {label: 'Execution Start Time', value: 'Nov 19th 2017, 02:31 PM EST'},
            {label: 'Execution End Time', value: 'Nov 19th 2017, 02:56 PM EST'}
        ]
    }
});