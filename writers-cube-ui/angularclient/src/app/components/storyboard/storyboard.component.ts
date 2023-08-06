import { Component, Input, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Storyboard } from 'src/app/models/storyboard';
import { Storyboardservice } from 'src/app/services/storyboard.service';
import { PlotpointService } from 'src/app/services/plotpoint.service';
import { Plotpoint } from 'src/app/models/plotpoint';
import { FormBuilder, FormGroup } from '@angular/forms';
import { Observable,Subscription, interval  } from 'rxjs';

@Component({
  selector: 'app-storyboard',
  template: '{{ storyboard }}',
  templateUrl: './storyboard.component.html',
  styleUrls: ['./storyboard.component.css']
})
export class StoryboardComponent implements OnInit {



plotpoint : Plotpoint = {id: '', storyBoardId: '', description: ''}
storyboard : Storyboard = {id: '', title: '', description: ''};
plotpoints : Plotpoint[] = [];
plotpointForm : FormGroup = this.formBuilder.group({description: ''});



constructor(private router : Router, private formBuilder: FormBuilder, private plotPointService : PlotpointService, private storyboardservice : Storyboardservice, private route : ActivatedRoute){}


delete(plotpoint: Plotpoint) {
  console.log("deleting plotpoint with id " + plotpoint.id);
  this.plotPointService.deletePlotPoint(plotpoint);
  this.plotPointService.findPlotPointByStoryboardId(this.storyboard.id).subscribe(data => {
    this.plotpoints = data;
  });
}

onSubmit() : void{
  this.plotpoint.id = Math.random().toString();
  this.plotpoint.storyBoardId = this.storyboard.id;
  this.plotPointService.addNewPlotPoint(this.plotpoint);
  this.plotPointService.findPlotPointByStoryboardId(this.storyboard.id).subscribe(data => {
    this.plotpoints = data;
  });

}
onClick() {
   this.plotPointService.generateRandomPlotpoint(this.storyboard);
   this.plotPointService.findPlotPointByStoryboardId(this.storyboard.id).subscribe(data => {
    this.plotpoints = data;
  });
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

   };
  }







