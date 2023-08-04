import { Component, Input, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Storyboard } from 'src/app/models/storyboard';
import { Storyboardservice } from 'src/app/services/storyboard.service';
import { PlotpointService } from 'src/app/services/plotpoint.service';
import { Plotpoint } from 'src/app/models/plotpoint';
import { FormBuilder, FormGroup } from '@angular/forms';

@Component({
  selector: 'app-storyboard',
  template: '{{ storyboard }}',
  templateUrl: './storyboard.component.html',
  styleUrls: ['./storyboard.component.css']
})
export class StoryboardComponent implements OnInit {



plotpoint : Plotpoint = {id: '', storyboardId: '', description: ''}
storyboard : Storyboard = {id: '', title: '', description: ''};
plotpoints : Plotpoint[] = [];
plotpointForm : FormGroup = this.formBuilder.group({description: ''});



constructor(private router : Router, private formBuilder: FormBuilder, private plotPointService : PlotpointService, private storyboardservice : Storyboardservice, private route : ActivatedRoute){}


onSubmit() : void{
  console.log(this.plotpoint.description);
  this.plotpoint.id = Math.floor((Math.random()*6)+1).toString();
  this.plotpoint.storyboardId = this.storyboard.id;
  this.plotPointService.addNewPlotPoint(this.plotpoint);
}
ngOnInit() {

 
  let storyboardId = this.route.snapshot.paramMap.get('id');
  if (storyboardId == null) {
    storyboardId = "1";
  }
  
  this.storyboardservice.findStoryBoardById(storyboardId).subscribe(data => {
    this.storyboard = data;
  });
  this.plotPointService.findPlotPointByStoryboardId(storyboardId).subscribe(data => {
    this.plotpoints = data;
  });

}






}


