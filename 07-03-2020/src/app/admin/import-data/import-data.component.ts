import { Component, OnInit } from '@angular/core';
import bsCustomFileInput from "bs-custom-file-input";

@Component({
  selector: 'app-import-data',
  templateUrl: './import-data.component.html',
  styleUrls: ['./import-data.component.css']
})
export class ImportDataComponent implements OnInit {

  constructor() { }
  file=File;

  ngOnInit() {
    bsCustomFileInput.init();
  }

  onFileChange(e)
  {
    this.file=e.target.files[0];
  }
}
