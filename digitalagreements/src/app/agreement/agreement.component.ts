import { Component, OnInit } from "@angular/core";

@Component({
  selector: "app-agreement",
  templateUrl: "./agreement.component.html",
  styleUrls: ["./agreement.component.css"]
})
export class AgreementComponent implements OnInit {
  constructor() {}

  ngOnInit() {}

  isagree: boolean = false;
  doNotAgree_msg: string =
    "Be Decliningthis Aggrement, You will be denied access to Secure JNET application \nAre You sure you want to select 'I DO NOT Agree'";
  doNotAgree(): void {
    if (window.confirm(this.doNotAgree_msg)) {
      this.isagree = false;
      console.log("aggree");
    }
  }

  agree(): void {
    this.isagree = true;
  }

  cancel(): void {
    this.isagree = false;
  }
}
