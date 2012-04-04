package com.knitml.dsl.ui.editor;

import java.util.ArrayList;
import java.util.List;

import javax.measure.Measurable;

import com.google.inject.Provider;
import com.knitml.core.units.StitchGauge;
import com.knitml.transform.gauge.event.TransformHandler;
import com.knitml.transform.gauge.event.TransformPatternEventListener;
import com.knitml.validation.context.PatternEventListener;

public class EventListenerCollectionProvider implements Provider<List<PatternEventListener>> {

	private Measurable<StitchGauge> targetStitchGauge;
	
	public EventListenerCollectionProvider(Measurable<StitchGauge> targetStitchGauge) {
		this.targetStitchGauge = targetStitchGauge;
	}
	
	public List<PatternEventListener> get() {
		List<PatternEventListener> listeners = new ArrayList<PatternEventListener>();
		TransformHandler handler = new TransformHandler();
		handler.setTargetGauge(targetStitchGauge);
		listeners.add(new TransformPatternEventListener(handler));
		return listeners;
	}

}
