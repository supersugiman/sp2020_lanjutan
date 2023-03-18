var ss = SpreadsheetApp.openByUrl("https://docs.google.com/spreadsheets/d/1EXtlaJilgl_sRsHvwdnM62xr8yl3Zuq7giC8NpB5L8o/edit#gid=0");
var sheet = ss.getSheetByName("updating"); //name sheet

function doGet(e){
  var action  = e.parameter.action;
 
  if(action == "tambah"){
    return Tambah(e,TW1);
  }
  
  if(action == "edit"){
    return Edit(e);
  }
  
   if(action == "hapus"){
    return Hapus(e);
  }
}

function doPost(e){
  var action  = e.parameter.action;
 
 
  if(action == "tambah"){
    return Tambah(e, sheet);
  }
  
  if(action == "edit"){
    return Edit(e);
  }
  
  if(action == "hapus"){
    return Hapus(e);
  }
}


function Tambah(e, sheet){
  
  var idnks = e.parameter.idnks;
  var p1 = e.parameter.p1;
  var p2 = e.parameter.p2;
  var p3 = e.parameter.p3;
  var p4a = e.parameter.p4a;
  var p4b = e.parameter.p4b;
  var p4c = e.parameter.p4c; 
  var p5 = e.parameter.p5;
  //var latilongi = e.parameter.latilongi;

  
  var flag=1;
  //var lr= sheet.getLastRow();
 // for(var i=1;i<=lr;i++){
   // var idruta1 = sheet.getRange(i, 1).getValue(); // Ashton: column index changed from 2 to 1
   // if(idruta1==idruta){
   //   flag=0;
   //   var result= "No Urut Ruta Sampel Dengan NKS Yang Sama Sudah ada";
   //   break; // Ashton: break the loop if id is found, this will save some time if your list is huge
   // } }
 // Logger.log(flag);
  //add new row with recieved parameter from client
  //if(flag==1)
  {
  var rowData = sheet.appendRow([idnks,p1,p2,p3,p4a,p4b,p4c,p5,new Date]);  
  var result="Berhasil Kirim Data";
  }
     return ContentService.createTextOutput(result).setMimeType(ContentService.MimeType.TEXT);
    
  return ContentService.createTextOutput(e.parameter.callback + "(" + result + ")").setMimeType(ContentService.MimeType.JAVASCRIPT);   
  }
  
function Edit(e){
  
  for(var i = 0;  i<values.length; i++){
    if(values[i][0]==id){
      i=i+2;
      
      
      
      return ContentService.createTextOutput("Berhasil merubah data!").setMimeType(ContentService.MimeType.TEXT);
      break;
      
    }
  }
  return ContentService.createTextOutput("ID tidak ditemukan!").setMimeType(ContentService.MimeType. TEXT);
}

function Hapus(e){
  var id =  e.parameter.idbrg;
  var values = sheet.getRange(2,1,sheet.getLastRow(),3).getValues();
  
  for(var i = 0;  i<values.length; i++){
    if(values[i][0]==id){
      i=i+2;
      
        sheet.deleteRow(i);
      
      return ContentService.createTextOutput("Berhasil menghapus data!").setMimeType(ContentService.MimeType.TEXT);
      break;
      
    }
  }
  return ContentService.createTextOutput("ID tidak ditemukan!").setMimeType(ContentService.MimeType. TEXT);
}


